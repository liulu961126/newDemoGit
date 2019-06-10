package thefivePag;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @author 六诗人
 * @title: ReflectionTest
 * @projectName newDemoGit
 * @description: TODO传入一个类并对这个类的能力进行分析
 * @date 2019/6/10上午 10:53
 */
@SuppressWarnings("all")
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        //当main方法传入参数不为零
        if (args.length > 0) name = args[0];
            //当main方法传入参数为零
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name(e.g. java.util.Date)");
            name = in.next();
        }
        try {//返回当前运行时对象的class类
            Class cl = Class.forName(name);
            //返回当前运行时对象的父类的Class类
            Class supercl = cl.getSuperclass();
            //可以对类和成员访问修饰符进行解码
            String modifiers = Modifier.toString(cl.getModifiers());
            //打印访问修饰符
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println("class " + name);
            //这里是判断有无继承类,有的话则展示
            if (supercl != null && supercl != Object.class) {
                System.out.print(" extends" + supercl.getName());
            }

            System.out.println("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class cl) {//打印构造方法
        Constructor[] constructors = cl.getDeclaredConstructors();//返回所有构造器
        for (Constructor c : constructors) {
            //返回一个构造器,方法或者域名的字符串
            String name = c.getName();
            System.out.print("   ");
            //返回访问修饰符
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.println(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.print(");");
        }
    }

    public static void printMethods(Class cl) {//打印所有方法,包括继承父类的
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            //这是一个描述返回类型的Class对象
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + "  ");
            System.out.println(retType.getName() + "  " + name + " (");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(",");
                System.out.print(paramTypes[j].getName());
            }
            System.out.print(")");
        }

    }

    public static void printFields(Class cl) {//返回所有的包括继承父类的属性
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            //返回一个包含这个属性所有信息的class类
            Class type = f.getType();//获取属性声明时类型对象
            String name = f.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(type.getName() + " " + name + " ;");
        }
    }


}
