package thesixPag;

/**
 * @author 六诗人
 * @title: Student
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/12下午 2:01
 */
@SuppressWarnings("all")
public class Student extends Person2 implements Person, Named {//哪一个接口在前就会优先实现这个接口,简单的讲,就近原则

    /* @Override
     public String getName() {
         return "学生";
     }
 */
  /*  @Override
    public String getName() {
        return Person.super.getName();//程序员可以自己选择要实现的类的方法
    }*/
    public static void main(String[] args) {
        System.out.println(new Student().getName());
    }

    @Override
    public String getName() {
        return "超类优先";
    }
}
