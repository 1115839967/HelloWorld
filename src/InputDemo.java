import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @program: HelloWorld
 * @description:
 * @author: liu yan
 * @create: 2020-01-21 09:14
 */
public class InputDemo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的语文成绩：");
        Long yuWen = input.nextLong();
        System.out.println("请输入您的数学成绩：");
        Long shuXue = input.nextLong();
        System.out.println("请输入您的英语成绩：");
        Long yingYu = input.nextLong();
        System.out.println("您的总成绩为：" + (yuWen + shuXue + yingYu));


        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入您的获奖感言：");
        String s = input2.readLine();
        System.out.println(s);
        input.close();
        input2.close();

    }
}