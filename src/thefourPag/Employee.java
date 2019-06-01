package thefourPag;

import java.time.LocalDate;

/**
 * @author 六诗人
 * @title: Employee
 * @projectName newDemoGit
 * @description: TODO薪资管理类
 * @date 2019/6/1下午 3:08
 */
@SuppressWarnings("all")
public class Employee {
    //薪资
    private Double salary;
    private String name;//人名
    private LocalDate hireDay;//发钱日

    //构造方法
    public Employee(String n, double s, int year, int month, int day) {
        salary = s;
        name = n;
        hireDay = LocalDate.of(year, month, day);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    /***
     * TODO 计算奖金和工资之和
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        double raise = byPercent * salary / 100;
        salary += raise;
    }
}
