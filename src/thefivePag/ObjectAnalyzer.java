package thefivePag;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @author 六诗人
 * @title: ObjectAnalyzer
 * @projectName newDemoGit
 * @description: TODO编写一个通用的toString 方法
 * @date 2019/6/10下午 5:06
 */
@SuppressWarnings("all")
public class ObjectAnalyzer {

    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj) {
        if (obj == null) return "null";
        if (visited.contains(obj)) return "...";
        visited.add(obj);
        Class cl = obj.getClass();
        if (cl == String.class) return (String) obj;
        if (cl.isArray()) {//为数组的情况
            String r = cl.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) r += ",";
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) r += val;
                else r += toString(val);
            }
        }
        String r = cl.getName();
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) r += ",";
                    r += f.getName() + "=";
                    try {
                        Class t = f.getType();
                        Object val = f.get(obj);
                        if (t.isPrimitive()) r += val;
                        else r += toString(val);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        } while (cl != null);
        return r;
    }


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
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            squares.add(i * i);
            System.out.println(new ObjectAnalyzer().toString(squares));
        }

    }
}
