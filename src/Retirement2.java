import java.util.Scanner;

/**
 * @author Administrator
 * @title: Retirement2
 * @projectName newDemoGit
 * @description: TODO利率计算do-while循环
 * @date 2019/5/29下午 2:13
 */
@SuppressWarnings("all")
public class Retirement2 {
    static Scanner in;
    static  double  goal, percents, years = 0, lilv, balance = 0,lixi;
    static  String input;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("你需要存储的总量");
        goal = in.nextDouble();
        System.out.println("每年存储的钱？");
        percents = in.nextDouble();
        System.out.println("利率多少？");
        lilv=in.nextDouble();
        do{
            balance+=percents;
            lixi=(balance*lilv)/100;
            balance+=lixi;
            years++;

            System.out.println("您现有钱数为"+balance);
            System.out.println("是否继续？Y/N");
            input=in.next();
        }while (input.equals("Y"));
    }
}
