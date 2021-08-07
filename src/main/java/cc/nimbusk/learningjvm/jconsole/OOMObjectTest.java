package cc.nimbusk.learningjvm.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存占位符对象，一个OOMObject大约占64KB<br>
 * 这段代码的作用是以64KB/50ms的速度向Java堆中填充数据，一共填充1000次，使用JConsole的“内存”页签进行监视，观察曲线和柱状指示图的变化。
 *
 * -Xms100m -Xmx100m -XX:+UseSerialGC
 *
 * @author nimbus.k 2021-08-03 22:22
 * @version 1.0
 */
public class OOMObjectTest {

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            // 稍作延时，令监视曲线的变化更加明显
            Thread.sleep(5);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception {
        for (int i = 10; i < 200;) {
            fillHeap(1000);
            if (i % 50 == 0) {
                System.gc();
            }
            i = i + 10;
        }

    }

}
