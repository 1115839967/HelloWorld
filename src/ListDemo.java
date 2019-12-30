import java.util.*;
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
        idList.add("15");
        idList.add("16");
        idList.add("17");
        idList.add("18");
        idList.add("19");
        idList.add("20");


        //单线程遍历
        long start1 = System.currentTimeMillis();
        idList.forEach(id -> {
            System.out.println(id + " 方法1，线程：" + Thread.currentThread().getId());
        });
        long end1 = System.currentTimeMillis();

        System.out.println("------------------------" + (end1 - start1) + "ms -----------------------------");

        //单线程遍历
        long start2 = System.currentTimeMillis();
        idList.stream().forEach(id -> {
            System.out.println(id + " 方法2，线程：" + Thread.currentThread().getId());
        });
        long end2 = System.currentTimeMillis();
        System.out.println("-------------------------" + (end2 - start2) + "ms ----------------------------");

        //多线程遍历
        long start3 = System.currentTimeMillis();
        List<String> synchronizedIdList = Collections.synchronizedList(idList);
        idList.parallelStream().forEach(id -> {
            System.out.println(id + " 方法3，线程：" + Thread.currentThread().getId());
        });
        long end3 = System.currentTimeMillis();
        System.out.println("-------------------------"+ (end3 - start3) + "ms ------------------------------");


    }
}
