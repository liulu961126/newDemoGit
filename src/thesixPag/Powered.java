package thesixPag;

/**
 * @author 六诗人
 * @title: Powered
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/12上午 10:48
 */
@SuppressWarnings("all")
public interface Powered extends Moveable {
    @Override
    void move(double x, double y);

    double SPEED_LIMIT = 95;

    default String isEmpty() {
        return 1 + "";
    }
}

class Test implements Powered {
    public static void main(String[] args) {
        Powered powered = new Test();
        System.out.println(powered.isEmpty());
    }

    @Override
    public void move(double x, double y) {
        System.out.println("子类覆盖");
    }
}