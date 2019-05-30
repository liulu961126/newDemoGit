package thethreepag;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 六诗人
 * @title: LotteryDrawing
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 5:49
 */
@SuppressWarnings("all")
public class LotteryDrawing {//抽奖算法

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");//取多少
        int k = in.nextInt();
        System.out.println("what is the highest number you can draw?");//取值范围
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;//先把所有可能的值付给number数组
        }
        int[] result = new int[k];//这个是抓到的值存放的数组
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);//这个为下标,正好可以取到0到n-1的下标
            result[i] = numbers[r];//刚取到的值就是r+1,因为存放的值就是这个
            numbers[r] = numbers[n - 1];//为了保证不再取到重复的值,这里就是将下标r的值改为最后一个数的值,然后n--缩短下标可以取值的范围
            n--;
        }
        Arrays.sort(result);
        System.out.println("排序成功，彩票购买完成");
        for (int r : result) {
            System.out.print(r + "---");
        }
    }
}

