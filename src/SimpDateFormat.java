import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @program: HelloWorld
 * @description:
 * @author: liu yan
 * @create: 2019-11-01 14:24
 */
public class SimpDateFormat {
    public static void main(String[] args) {

        String str = "2019/11";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM");
//        try {
//            simpleDateFormat.parse(str);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.out.println(1111111);
//        }

        String reg = "\\d{4}/\\d{2}?";
        boolean b = str.matches(reg);
        System.out.println(b);


    }
}