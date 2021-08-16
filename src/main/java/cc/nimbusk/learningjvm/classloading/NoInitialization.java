package cc.nimbusk.learningjvm.classloading;

/**
 * TODO
 *
 * @author nimbus.k 2021-08-16 17:39
 * @version 1.0
 */
public class NoInitialization {

    public static void main(String[] args) {
        // 示例1
//        System.out.println(SubClass.value);
        // 示例2
//        SuperClass[] sca = new SuperClass[10];
        // 示例3
        System.out.println(ConstClass.HELLOWORLD);
    }

}
