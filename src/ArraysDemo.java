import java.util.Arrays;

/**
 * @author 六诗人
 * @title: ArraysDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 5:35
 */
@SuppressWarnings("all")
public class ArraysDemo {

    public static void main(String[] args) {
        //定义两个Int数组,变量相等那么他们指向同一个数组
        int a[] = {1, 2, 3, 4};
        int b[] = a;
        b[2] = 5;
        System.out.println(Arrays.toString(a));
        //数组拷贝,不会改变原有数组的值,a.length可以改为新数组的长度
        int c[] = Arrays.copyOf(a, 7);
        c[2] = 6;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(a));
    }
}
