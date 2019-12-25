import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CompratorTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String a = "2019-08-05";
        String b = "2019-08-03 12:00:00";
        String c = "2019-08-07";
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        try {
            Date parse1 = sdf.parse(a);
            Date parse2 = sdf.parse(b);
            Date parse3 = sdf.parse(c);
            date1 = parse1;
            date2 = parse2;
            date3 = parse3;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        User user1 = new User("zhangsan",true,date1);
        User user2 = new User("lisi",false,date2);
        User user3 = new User("wangwu",true,date3);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(list);
    }
}
