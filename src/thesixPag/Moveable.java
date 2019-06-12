package thesixPag;

/**
 * @author 六诗人
 * @title: Moveable
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/12上午 10:47
 */
@SuppressWarnings("all")
public interface Moveable {
    void move(double x,double y);
    default String isEmpty(){
        return 2+"";
    }
}
