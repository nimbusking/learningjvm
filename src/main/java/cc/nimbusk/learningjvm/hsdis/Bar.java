package cc.nimbusk.learningjvm.hsdis;

/**
 * TODO
 * 虚拟机参数：-XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -Xcomp -XX:CompileCommand=dontinline,*Bar.sum -XX:CompileCommand=compileonly,*Bar.sum
 * 命令行：java -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -Xcomp -XX:CompileCommand=dontinline,*Bar.sum -XX:CompileCommand=compileonly,*Bar.sum cc.nimbusk.learningjvm.hsdis.Bar
 * @author nimbus.k 2021-08-07 11:51
 * @version 1.0
 */
public class Bar {

    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        new Bar().sum(3);
    }

}
