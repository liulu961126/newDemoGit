package thefivePag;

/**
 * @author 六诗人
 * @title: ObjectBaoZhuang
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/8上午 11:18
 */
@SuppressWarnings("all")
public class ObjectBaoZhuang {
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) if (v > largest) largest = v;
        return largest;
    }

    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
        if (a == b) System.out.println("不可能吧");//这里a和b指向的对象地址
        //但是值改为100,这是因为值小于127的int,short对象都会被包装到固定的对象中;
        a = 100;
        b = 100;
        if (a == b) System.out.println("理论成功");
        //解决办法是调用equals方法
        if (a.equals(b)) System.out.println("理论成功");
        //可变参数求最大值
        System.out.println(max(12,32,12,324321));
    }
}
