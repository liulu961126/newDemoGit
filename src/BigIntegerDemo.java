import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 六诗人
 * @title: BigIntegerDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 4:59
 */
@SuppressWarnings("all")
public class BigIntegerDemo {//用于大数据运算

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("抽多少次");
        int num=in.nextInt();
        System.out.println("抽的最大数值");
        int total=in.nextInt();
        //临时变量
        BigInteger lotteryOdds=BigInteger.valueOf(1);
        for(int i=1;i<=num;i++){
            lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(total+1-i)).divide(BigInteger.valueOf(i));
        }
        System.out.println("抽中概率为1/"+lotteryOdds);
    }

}
