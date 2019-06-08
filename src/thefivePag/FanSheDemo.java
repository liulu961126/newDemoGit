package thefivePag;

/**
 * @author 六诗人
 * @title: FanSheDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/8下午 3:35
 */
@SuppressWarnings("all")
public class FanSheDemo {
    public static void main(String[] args) {
        //下面介绍的是三种获取类CLASS的方式
        //getClass()保存的是类运行时的信息
        Employee e = new Employee("hacker", 2312, 1232, 12, 1);
        Employee e2 = new Manager("hacker", 2312, 1232, 12, 1);
        e2.setSalary(2312.23);
        System.out.println(e.getClass() + "--" + e.getName());
        System.out.println(e2.getClass() + "--" + e2.getName());
        //可以根据类名得到这个运行时类的对象,forName();
        String className = "java.util.Random";
        try {
            Class el = Class.forName(className);
            System.out.println(el.getName());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        //.clas方式
        Class el2 = Employee.class;
        Class el3 = int.class;
        Class el4 = Double.class;
        System.out.println(el2.getName() + "--" + el3.getName() + "--" + el4.getName());
        //数组类型获取class
        System.out.println(Double[].class.getName() + "---" + int[].class.getName());
        //.class还可以比较两个对象
        if (e.getClass() == Employee.class) System.out.println("确实可以");


        //利用.class与newInstance动态创建一个对象
        String s = "java.util.Random";
        try {
            Object o = Class.forName(s).newInstance();
            System.out.println(o.getClass().getName());
        } catch (Exception o) {
            o.printStackTrace();
        }

    }


}
