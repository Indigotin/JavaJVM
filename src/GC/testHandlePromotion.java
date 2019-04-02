package GC;

/**
 * Created by Len on 2019-04-02
 */
public class testHandlePromotion {

    private static final int _1Mb = 1024*1024;
    /*
    * VM参数：
    -XX:+UseSerialGC
    -verbose:gc
    -Xms20M
    -Xmx20M
    -Xmn10M
    -XX:+PrintGCDetails
    -XX:SurvivorRatio=8
    //JDK6 Update24之后的规则变为只要老年代的连续空间大于新生代对象总大小或者历次晋升的平均大小就会进行Minor GC 否则进行Full GC
    -XX:HandlePromotionFailure=false
    -XX:HandlePromotionFailure=true
    * */

    public static void main(String[] args){
        byte[] allocation1,allocation2,allocation3,allocation4,allocation5,allocation6,allocation7;
        allocation1 = new byte[_1Mb*2];
        allocation2 = new byte[_1Mb*2];
        allocation3 = new byte[_1Mb*3];
        allocation1=null;

        allocation4 = new byte[_1Mb*2];
        allocation5 = new byte[_1Mb*2];
        allocation6 = new byte[_1Mb*2];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;

        allocation7 = new byte[_1Mb*2];
    }

}
