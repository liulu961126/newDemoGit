package thefivePag;

/**
 * @author 六诗人
 * @title: Student
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/4下午 5:49
 */
@SuppressWarnings("all")
public class Student extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in" + major;
    }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
