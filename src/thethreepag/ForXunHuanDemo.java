package thethreepag;

import java.util.Scanner;

/**
 * @author 六诗人
 * @title: ForXunHuanDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 3:22
 */
@SuppressWarnings("all")
public class ForXunHuanDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("抽次数");
        int num = in.nextInt();
        System.out.println("最大数字为？");
        int total = in.nextInt();
        int lotteryOdds = 1;//临时变量，用来存储概率值
        for (int i = 1; i <= num; i++) {
            lotteryOdds = lotteryOdds * (total - i + 1) / i;
        }
        System.out.println("概率为1/"+lotteryOdds);
    }
}
