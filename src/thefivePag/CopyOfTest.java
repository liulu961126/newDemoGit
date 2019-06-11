package thefivePag;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 六诗人
 * @title: CopyOfTest
 * @projectName newDemoGit
 * @description: TODO编写一个动态生成数组的工具类
 * @date 2019/6/11下午 2:35
 */
@SuppressWarnings("all")
public class CopyOfTest {
    public static Object goodCopy(Object a, int newlength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();//得到一个运行时数组对象
        int length = Array.getLength(a);//得到新数组的长度
        Object newArray = Array.newInstance(componentType, length);//利用单例模式创建一个返回对象
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newlength));
        return newArray;//返回数组对象
    }

    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;//返回数组对象
    }

    public static void main(String[] args) {
        int a[] = {1, 22, 3};
        a = (int[]) goodCopy(a, 10);
        System.out.println(a.length);
        String b[] = {"a", "b", "c"};
        b = (String[]) goodCopy(b, 12);
        System.out.println(Arrays.toString(b));
        //这里会报异常,因为参数是一个Object类型的数组对象,而强制转换为了String类型对象
        b = (String[]) badCopyOf(b, 12);
        System.out.println(Arrays.toString(b));
    }
}
