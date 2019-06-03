package thefourPag;

import java.text.NumberFormat;

/***
 * 工厂方法
 */
@SuppressWarnings("all")
public class FactoryDemo {
    public static void main(String[] args) {
        //静态工厂方法
        NumberFormat currencyFormatter=NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter=NumberFormat.getPercentInstance();
        double x=0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }
}
