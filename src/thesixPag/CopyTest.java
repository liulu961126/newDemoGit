package thesixPag;

import thefivePag.Employee;

import java.util.Arrays;

/**
 * @author 六诗人
 * @title: CopyTest
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/12下午 3:56
 */
@SuppressWarnings("all")
public class CopyTest {
    public static void main(String[] args) {
        try {//实现了Object类的clone方法的类必须将clone方法的访问修饰符定义为public
            Employee employee = new Employee("ceshi", 12323, 1223, 12, 12);
            Employee copy = employee.clone();
            //每一个数组都有一个public的clone方法,可以用来拷贝原来的数组
            int a[]={1,2,3,4};
            int b[]=a.clone();
            b[3]=5;
            System.out.println(Arrays.toString(b)+"--"+Arrays.toString(a));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
