import java.util.Arrays;
import java.util.List;

/**
 * @program: HelloWorld
 * @description:
 * @author: liu yan
 * @create: 2019-08-28 11:01
 */
public class StringDemo {
    public static void main(String[] args) {

        String code = "90006006";
        System.out.println(code.substring(3));

        String idStr = "123,456,789";
        String[] split = idStr.split(",");
        List<String> idList = Arrays.asList(split);
        idList.forEach(id -> {
            System.out.println(id);
        });
    }
}