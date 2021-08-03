package cc.nimbusk.jhsdb;

public class JHSDBTest {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();
        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            // 调试运行的时候，在这里设置一个断点，以方便通过jps获取jvm进程id
            System.out.println("done");
        }
    }

    private static class ObjectHolder {}

    public static void main(String[] args) {
        Test test = new JHSDBTest.Test();
        test.foo();
    }

}
