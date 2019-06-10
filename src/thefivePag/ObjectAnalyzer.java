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
            Employee employee = new Employee("Harry Hacke", 3520, 10, 11, 1);
            Class cl = employee.getClass();
            Field f = cl.getDeclaredField("name");
            Object v =f.get(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
