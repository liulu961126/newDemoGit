package thesixPag;

import java.util.ArrayList;
import java.util.List;

public class ArraylistRemoveIfTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("lasdfk");
        list.add("las的规范和豆腐干dfk");
        list.add("阿道夫");
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        list.removeIf(e -> e == null);
        System.out.println(list.size());
    }
}
