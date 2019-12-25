import java.util.*;

public class IteratorTest {
    public static void main(String [] args){
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        user1.setName("zhangsan");
        user2.setName("lisi");
        user3.setName("wangwu");
        user4.setName("zhaoliu");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        /*Set set = new HashSet();
        set.add(123);
        set.add("aaa");
        set.add(333);
        for(Iterator it = set.iterator();it.hasNext();){
            System.out.println("value:"+it.next().toString());
        }*/
        removeList1(userList);
        System.out.println(userList);
        removeList2(userList);
        System.out.println(userList);
    }

    private static void removeList1(List<User> userList) {
        for (int i = userList.size() - 1; i >= 0 ; i--) {
            if ("lisi".equals(userList.get(i).getName())) {
                userList.remove(i);
            }
        }
    }

    private static void removeList2(List<User> userList) {
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if ("wangwu".equals(user.getName())) {
                userList.remove(user);
            }
        }
    }
}
