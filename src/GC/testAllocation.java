package GC;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * Created by Len on 2019-04-02
 */
public class testAllocation {

    private static final int _1Mb = 1024*1024;

    /*
    * VM参数：
    -verbose:gc
    -Xms20M
    -Xmx20M
    -Xmn10M
    -XX:+PrintGCDetails
    -XX:SurvivorRatio=8
    默认使用的是
    PS Scavenge
    PS MarkSweep
    * */

    public static void main(String[] args){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1Mb];
        allocation2 = new byte[2 * _1Mb];
        allocation3 = new byte[2 * _1Mb];
        allocation4 = new byte[4 * _1Mb];

        //查看jvm垃圾收集器
        /*List<GarbageCollectorMXBean> beans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : beans) {
            System.out.println(bean.getName());
        }*/
    }
}
