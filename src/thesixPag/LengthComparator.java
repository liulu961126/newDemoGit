package thesixPag;

import java.util.Comparator;

/**
 * @author 六诗人
 * @title: LengthComparator
 * @projectName newDemoGit
 * @description: TODO比较器实现类
 * @date 2019/6/12下午 2:46
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthComparator().compare("hello", "niha"));
    }
}
