import java.util.Scanner;

/**
 * @author 六诗人
 * @title: SwitchDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 4:35
 */
@SuppressWarnings("all")
public class SwitchDemo {
    public static void main(String[] args) {
        //尽量避免使用switch
        System.out.println("选择菜单（1,2,3,4）");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch (x) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("无语");
                break;
        }


    }
}
