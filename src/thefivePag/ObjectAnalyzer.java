package thefivePag;

import java.lang.reflect.Field;

/**
 * @author 六诗人
 * @title: ObjectAnalyzer
 * @projectName newDemoGit
 * @description: TODO编写一个通用的toString 方法
 * @date 2019/6/10下午 5:06
 */
@SuppressWarnings("all")
public class ObjectAnalyzer {
    public static void main(String[] args) {

        try {
            //创建一个对象
            Employee employee = new Employee("Harry Hacke", 3520, 10, 11, 1);
            Class cl = employee.getClass();//得到运行时类
            Field f = cl.getDeclaredField("salary");//得到一个包含指定域的对象
            //设置安全级别
            f.setAccessible(true);
            Object v = f.getDouble(employee);//得到这个指定域对象的当前值,受控于访问权限
            System.out.println(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
