package thefourPag;

import java.time.LocalDate;

/**
 * @author 六诗人
 * @title: LocalDateDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/30下午 3:04
 */
@SuppressWarnings("all")
public class LocalDateDemo {
    public static void main(String[] args) {
        //localdate可以拿到指定日期的所有数据
        LocalDate localDate = LocalDate.of(2019, 5, 30);
        System.out.println(localDate.getYear() + "月" + localDate.getMonthValue() + "日" + localDate.getDayOfMonth());
        //获取指定天数之后的日期
        LocalDate todayBefore = localDate.plusDays(10);
        System.out.println(todayBefore.getYear() + "年" + todayBefore.getMonthValue() + "月" + todayBefore.getDayOfMonth() + "日");
    }
}
