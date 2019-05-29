import java.util.Arrays;

/**
 * @author 六诗人
 * @title: ArraysSort
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 5:44
 */
@SuppressWarnings("all")
public class ArraysSort {
    public static void main(String[] args) {
        //快排
        int[] a = {1, 2, 3, 4, 5, 43, 45, 12, 23, 12, 65, 12};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
