import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InteratorTest2 {
    public static void main(String[] args) {
        String init[] = {"One","Two","Three","One","Two","Three"};
        String one[] = {"One"};
        List list1 = new ArrayList(Arrays.asList(init));
        List list2 = new ArrayList(Arrays.asList(init));

//        list1.remove("One");
//        list1.removeAll("One");


        System.out.println(list1);

        list2.removeAll(Collections.singleton("One"));
        System.out.println(list2);
        System.out.println(Collections.singleton("One"));

    }
}
