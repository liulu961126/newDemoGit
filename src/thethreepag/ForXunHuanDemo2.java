package thethreepag;

import java.util.Scanner;

/**
 * @author 六诗人
 * @title: ForXunHuanDemo2
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 4:01
 */
@SuppressWarnings("ALL")
public class ForXunHuanDemo2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("How many numbers do you need to draw");
        int k=in.nextInt();
        System.out.println("What is the highest number you can draw");
        int n=in.nextInt();
        int lotteryOdds=1;
        for(int i=1;i<=k;i++){
            lotteryOdds=lotteryOdds*(n-i+1)/i;

        }
        System.out.println("Your odds are 1 in "+lotteryOdds+"  Good luck");
    }
}
