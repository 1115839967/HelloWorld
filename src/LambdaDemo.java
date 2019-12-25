import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * lambda表达式
 */
public class LambdaDemo {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三", true, new Date()));
        userList.add(new User("李四", false, new Date()));
        userList.add(new User("王五", true, new Date()));
        userList.add(new User("小明", true, new Date()));
        userList.add(new User("小红", true, new Date()));
        userList.add(new User("大雄", true, new Date()));


        one(userList);
        System.out.println(userList);
    }

    private static void one(List<User> userList) {
        Collections.sort(userList, (user1, user2) -> user1.getName().compareTo(user2.getName()));
    }

    private static void two(List<User> userList) {
        
    }
}