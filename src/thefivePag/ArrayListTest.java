package thefivePag;

import java.util.ArrayList;

/**
 * @author 六诗人
 * @title: ArrayListTest
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/8上午 10:47
 */
@SuppressWarnings("all")
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("jocker", 1232, 1232, 12, 11));
        list.add(new Employee("nuller", 1232, 1232, 12, 11));
        list.add(new Employee("blakcer", 1232, 1232, 12, 11));
        for (Employee employee : list) System.out.println(employee.getName());
    }
}
