package thefourPag;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author 六诗人
 * @title: LocalDateDemo2
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/30下午 3:36
 */
@SuppressWarnings("all")
public class LocalDateDemo2 {
    public static void main(String[] args) {
        //首先获取当前月日
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);//获得当前日期之前的N天的日期，参数为-则是之后,这样就可以将这个月的第一天给date
        //国际标准获取每月初一是星期几，1-7分别对应周一到周日
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        //第一行是有空格的
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }
        //只要在本月就一直循环,若是当前时间则*
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
