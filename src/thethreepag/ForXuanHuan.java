package thethreepag;

/**
 * @author 六诗人
 * @title: ForXuanHuan
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 2:34
 */
@SuppressWarnings("all")
public class ForXuanHuan {
    public static void main(String[] args) {
//        倒计时
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //死循环
       /* for (double i = 1; i != 10; i += 0.1) {
            System.out.println("你完了");
        }*/
//     可以改为while
        int i = 10;
        while (i > 0) {
            System.out.print(i);
            i--;
        }
    }
}
