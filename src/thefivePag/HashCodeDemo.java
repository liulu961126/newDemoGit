package thefivePag;

/**
 * @author 六诗人
 * @title: HashCodeDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/8上午 8:59
 */
@SuppressWarnings("all")
public class HashCodeDemo {
    public static void main(String[] args) {
        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + "---" + sb.hashCode());
        String t=new String("Ok");
        StringBuilder tb=new StringBuilder(t);
        System.out.println(t.hashCode()+"----"+tb.hashCode());
    }
}
