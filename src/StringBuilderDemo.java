import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: HelloWorld
 * @description:
 * @author: liu yan
 * @create: 2019-11-06 11:35
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        /*String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(","+ null);
        System.err.println(stringBuilder);
        stringBuilder.append(str);
        System.out.println(stringBuilder + "-------");

        String [] strArr = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(strArr));

        String string = "a,b,c,d";


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String join = StringUtils.join(list, ",");
        System.out.println(join);

        String s = "aaaa";
        String str1 = "aaa";
        boolean b = s.contains(str1);
        System.out.println(b);

        String uuid = "asdjue7wksjf9sjfhnsad99asda0asda";
        String replace = uuid.replace(" ", "-");
        System.out.println(replace);

        String json = "{\"result\":{\"code\":113,\"isNewCustomer\":false,\"desc\":\"该手机号已注册过会员。\"},\"seqNo\":\"85647dcc-1b45-415f-80ce-48b32eec0d35\"}";*/

        float a = 21.10f;

        BigDecimal bigDecimal = new BigDecimal(a);
        System.out.println(bigDecimal);

        BigDecimal price = BigDecimal.valueOf(10L);
        BigDecimal total = BigDecimal.valueOf(10L);

        int i = total.compareTo(price);
        System.out.println(i);

    }
}