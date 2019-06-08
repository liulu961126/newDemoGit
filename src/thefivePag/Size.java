package thefivePag;

/**
 * @author 六诗人
 * @title: Size
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/8下午 2:13
 */
@SuppressWarnings("all")
public enum Size {
    //每一个枚举类型都相当于这个枚举类的一个实例,那么构造方法作用就是初始化这么类型,当然属性也就属于这个类型
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }


    public String getAbbreviation() {
        return abbreviation;
    }

    public static void main(String[] args) {
        //调用方式为这样枚举类名.类型名.方法
        System.out.println(Size.SMALL.toString());
        //toString()逆方法,把所有的s设置成SMALL枚举类型
        Size s= Enum.valueOf(Size.class,"SMALL");
        System.out.println(s.getAbbreviation());
        //拿到所有枚举值在数组里的下标
        for(Size ss : Size.values()){
            System.out.println(ss.ordinal());
        }
    }
}
