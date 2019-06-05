package thefivePag;

/**
 * @author 六诗人
 * @title: PDemo
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/5上午 9:33
 */
public class PDemo {
    public void say() {
        System.out.println("父类方法");
    }
}

class SDemo extends PDemo {
    @Override
    public void say() {
        System.out.println("子类方法");
    }
}

class Test {
    public static void main(String[] args) {
        PDemo pDemo = new SDemo();
        SDemo sDemo1 = new SDemo();
        PDemo pDemo1 = new PDemo();
        //成立,因为他们实际对象类型相同,而父类引用是可以直接向下引用子类对象的
        pDemo = sDemo1;
        //这里报错,因为他们实际对象是不同的,一个指向父类对象,一个实际上是子类对象,而他们对象的内容是不一样的,所以类型无法强制转换
        //SDemo sDemo=(SDemo) pDemo1;
        pDemo.say();
        pDemo1.say();
        //sDemo.say();
    }
}