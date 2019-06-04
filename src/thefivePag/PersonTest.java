package thefivePag;

/**
 * @author 六诗人
 * @title: PersonTest
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/4下午 5:57
 */
@SuppressWarnings("all")
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student("Maria Morris", "computer science");
        people[1] = new Employee("Harry Hacker", 50000, 1897, 10, 1);
        for (Person person : people) {
            System.out.println(person.getName() + "--" + person.getDescription());
        }
    }
}
