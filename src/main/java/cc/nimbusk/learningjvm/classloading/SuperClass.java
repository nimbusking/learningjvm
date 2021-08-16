package cc.nimbusk.learningjvm.classloading;

/**
 * 通过子类引用父类的静态字段，不会导致子类初始化
 *
 * @author nimbus.k 2021-08-16 17:38
 * @version 1.0
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init");
    }

    public static int value = 123;

}
