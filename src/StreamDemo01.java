import java.util.ArrayList;
import java.util.List;

/**
 * @program: HelloWorld
 * @description:
 * @author: liu yan
 * @create: 2019-10-09 10:42
 */
public class StreamDemo01 {

    public static void main(String[] args) {
        methodsOne();
    }

    private static void methodsOne() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(3);
        list.add(4);
        list.add(null);
        list.add(6);
        list.add(7);
        list.add(null);

        long count = list.stream().filter(num -> num != null).count();
        System.out.print ("methodsOne:-------");
        System.out.println(count);
    }

    private static void methodsTwo() {

    }


}