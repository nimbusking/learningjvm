package cc.nimbusk.learningjvm.classloading;

/**
 * TODO
 *
 * @author nimbus.k 2021-08-16 17:49
 * @version 1.0
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";

}
