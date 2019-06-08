package thefivePag;

/**
 * @author 六诗人
 * @title: ToStringDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/8上午 10:04
 */
@SuppressWarnings("all")
public class ToStringDemo {
    public static void main(String[] args) {
        Employee e = new Employee("jkd", 23, 2312, 12, 12);
        System.out.println(e.toString());
        Employee man = new Manager("jkd", 23, 2312, 12, 12);
        System.out.println(man.toString());
    }
}

