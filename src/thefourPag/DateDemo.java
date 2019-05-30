package thefourPag;

import java.util.Date;

/**
 * @author 六诗人
 * @title: DateDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/30下午 2:36
 */
@SuppressWarnings("all")
public class DateDemo {
    public static void main(String[] args) {
//        System.out.println(new Date());
        Date birthday=new Date();
        Date deadline=birthday;
        System.out.println(birthday.toString()+"go"+deadline.toString());
    }
}
