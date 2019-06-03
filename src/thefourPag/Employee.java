package thefourPag;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 * @author 六诗人
 * @title: Employee
 * @projectName newDemoGit
 * @description: TODO薪资管理类
 * @date 2019/6/1下午 3:08
 */
@SuppressWarnings("all")
public class Employee {
    private static int nextId = 1;
    private Integer id = assignId();
    //静态代码块
    static {
        System.out.println("静态代码块执行");
        Random generator=new Random();
        nextId=generator.nextInt(1000);
    }
    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }
    //代码块,当初始化对象就会执行
    {
        id=nextId;
        nextId++;
    }
    private static int assignId() {
        System.out.println("静态方式执行");
        int r = nextId;
        nextId++;
        return r;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //薪资
    private Double salary;
    private String name;//人名
    private LocalDate hireDay;//发钱日
    private Date testDate;//测试日期

    public Date getTestDate() {
        return (Date) testDate.clone();//返回的是一个克隆过后的对象
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    //构造方法
    public Employee(String n, double s, int year, int month, int day) {
        salary = s;
        name = n;
        hireDay = LocalDate.of(year, month, day);
        id = nextId;
        nextId++;
    }

    private Employee() {

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

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getId());
        ;
    }
}
