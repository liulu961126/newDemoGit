package thesixPag;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

@SuppressWarnings("all")
public class LambdaTest {
    public static void main(String[] args) {
//        参数 -> 表达式，构成lambda
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("排序后");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("根据字符串长度排序");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, event ->
                System.out.println("The time is" + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
