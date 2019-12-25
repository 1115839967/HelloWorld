import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");

        b.add("a");
        b.add("b");

        /*for (int i = 0; i < a.size(); i++) {
            a.remove(1);

            System.out.println(a.get(i));
        }*/
        listForEach();


        //System.out.println(a.equals(Double.parseDouble(c)));

    }


    public static void listForEach() {
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("zhangsan", true, new Date()));
        userList.add(new User("lisi", false, new Date()));
        userList.add(new User("wangwu", true, new Date()));
        userList.add(new User("zhaoliu", true, new Date()));
        userList.add(new User("xiaoming", true, new Date()));
        userList.add(new User("xiaohong", false, new Date()));

//        userList.forEach(user ->{
//            System.out.println(user.getName());
//        });

        Map<String, User> collect = userList.stream().collect(Collectors.toMap(User::getName, Function.identity(), (user1, user2) -> user1));
        System.out.println(userList.subList(0, 3));
    }
}
