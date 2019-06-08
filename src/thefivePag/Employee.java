package thefivePag;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author 六诗人
 * @title: Employee
 * @projectName newDemoGit
 * @description: TODO薪资管理类
 * @date 2019/6/1下午 3:08
 */
@SuppressWarnings("all")
public class Employee extends Person {

    private double bonus;//奖金
    private double salary;//薪资
    //private String name;//人名
    private LocalDate hireDay;//发钱日


    //构造方法
    public Employee(String name, double s, int year, int month, int day) {
        super(name);
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

//    public Employee(String name) {
//        System.out.println("父类构造方法被调用了");
//    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String getDescription() {
        return String.format("an employeee with a salary of $%.2f", salary);
    }

    public Employee(String name) {
        super(name);
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

    /***
     * TODO类的比较方法自己实现
     * @param otherObject
     * @return
     */
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        Employee employee = (Employee) otherObject;
        //使用Objects的equals方法是为了解决两个对象的name都为空的可能
        return Objects.equals(this.getName(), employee.getName()) && this.salary == employee.salary && this.hireDay.equals(employee.hireDay);
    }

    /***
     * TODO重写equals方法就必须得重写hashCode方法让它们返回相同的hashCode值
     * @return
     */
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getHireDay());
    }

    public String toString() {
        return getClass().getName()+"[name=" + getName() + ",salary=" + getSalary() + ",hireDay=" + getHireDay() + "]";
    }
}

