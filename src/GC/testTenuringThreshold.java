package GC;

/**
 * Created by Len on 2019-04-02
 */
public class testTenuringThreshold {
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
    -XX:MaxTenuringThreshold=1
    -XX:+PrintTenuringDistribution
    * */
    public static void main(String[] args){
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1Mb/4];
        allocation2 = new byte[_1Mb*4];
        allocation3 = new byte[_1Mb*4];
        allocation3 = null;
        allocation3 = new byte[_1Mb*4];
    }
}
