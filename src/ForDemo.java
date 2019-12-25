import java.util.ArrayList;
import java.util.List;

/**
 * @program: HelloWorld
 * @description:
 * @author: liu yan
 * @create: 2019-09-18 13:55
 */
public class ForDemo {
    public static void main(String[] args) {

        List<String> stringsOne = new ArrayList<>();
        stringsOne.add("1");
        stringsOne.add("2");
        stringsOne.add("3");
        stringsOne.add("4");
        stringsOne.add("5");

        List<String> stringsTwo = new ArrayList<>();
        stringsTwo.add("1");
        stringsTwo.add("2");
        stringsTwo.add("3");

        for (String s : stringsOne) {
            System.out.println(s);

            for (String s1 : stringsTwo) {
                System.out.println(s1);

                if ("b".equals(s1)) {
                    break;
                }
            }
        }

        System.out.println(stringsOne.contains("1"));
    }
}