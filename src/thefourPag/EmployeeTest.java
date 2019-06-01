package thefourPag;

/**
 * @author 六诗人
 * @title: EmployeeTest
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/1下午 3:23
 */
@SuppressWarnings("all")
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Carl Cracker", 7500, 1987, 12, 15);
        employees[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        employees[2] = new Employee("Tony Tester", 4000, 1990, 3, 15);
        //计算总工资
        for (Employee item : employees) {
            item.raiseSalary(5);
        }
        //展示
        for (Employee item : employees) {
            System.out.println(item.getName() + "工资" + item.getSalary() + "出生时间" + item.getHireDay());
        }
    }
}
