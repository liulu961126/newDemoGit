package thefivePag;

/**
 * @author 六诗人
 * @title: Manager
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/4下午 2:29
 */
@SuppressWarnings("all")
public class Manager extends Employee {
    private double bouns;

    @Override
    public boolean equals(Object otherObject) {//子类重写父类方法,比较的话得先比较父类方法,最后比较子类方法
        if (!super.equals(otherObject)) {
            return false;
        }

        Manager manager = (Manager) otherObject;
        return this.bouns == manager.bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public Manager(String name) {
        super(name);
    }

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bouns = 0;
    }

    @Override
    public Double getSalary() {
        return super.getSalary() + bouns;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        manager.setBouns(500);
        Employee[] staff = new Employee[3];
        staff[0] = manager;
        staff[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 4000, 1990, 3, 15);
        for (Employee e : staff) {
            System.out.println(e.getName() + e.getSalary());
        }
        //staff[0]是一个Employee对象变量不能调用Manager对象,而子类变量是可以引用父类对象的
        if (staff[1] instanceof Manager) {//显然staff[1]不是Manager的实例
            manager = (Manager) staff[1];
        }
        System.out.println(manager.getName());
        Manager x = null;
        if (x instanceof Manager) {
            System.out.println("引用一个Null");
        } else {
            System.out.println("这里是因为x虽然是Manager类的引用,但是他的对象是一个null,所以不会引用Manager类的对象,返回false");
        }
    }


}
