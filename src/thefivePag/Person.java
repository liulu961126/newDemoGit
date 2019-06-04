package thefivePag;

/**
 * @author 六诗人
 * @title: Person
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/4下午 5:47
 */
@SuppressWarnings("all")
public abstract class Person {
    public abstract String getDescription();

    private String name;

    //构造
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
