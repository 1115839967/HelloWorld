import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

        forEeachList();

        /*for (int i = 0; i < a.size(); i++) {
            a.remove(1);

            System.out.println(a.get(i));
        }*/
//        listForEach();


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

    private static void forEeachList() {
        List<String> idList = new ArrayList<>();
        idList.add("1");
        idList.add("2");
        idList.add("3");
        idList.add("4");
        idList.add("5");
        idList.add("6");
        idList.add("7");
        idList.add("8");
        idList.add("9");
        idList.add("10");
        idList.add("11");
        idList.add("12");
        idList.add("13");
        idList.add("14");


        //单线程遍历
        idList.forEach(id -> {
            System.out.println(id + " 方法1，线程：" + Thread.currentThread().getId());
        });
        System.out.println("-----------------------------------------------------");

        //单线程遍历
        idList.stream().forEach(id -> {
            System.out.println(id + " 方法2，线程：" + Thread.currentThread().getId());
        });
        System.out.println("-----------------------------------------------------");

        //多线程遍历
        idList.parallelStream().forEach(id -> {
            System.out.println(id + " 方法3，线程：" + Thread.currentThread().getId());
        });
        System.out.println("-----------------------------------------------------");


    }
}
