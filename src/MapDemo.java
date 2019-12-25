import java.util.*;

/**
 *
 */
public class MapDemo {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("张三", true, new Date()));
        users.add(new User("李四", true, new Date()));
        users.add(new User("王五", true, new Date()));
        users.add(new User("赵六", true, new Date()));
        users.add(new User("陈七", true, new Date()));


        Map<String, List<User>> usersMap = new HashMap<>();
        usersMap.put("A组", users);
        usersMap.put("B组", users);

        System.out.println(usersMap);



    }
}