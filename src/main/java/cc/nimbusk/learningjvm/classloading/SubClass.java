package cc.nimbusk.learningjvm.classloading;

/**
 * TODO
 *
 * @author nimbus.k 2021-08-16 17:38
 * @version 1.0
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("subClass init!");
    }
}
