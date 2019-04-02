package GC;

/**
 * Created by Len on 2019-04-02
 */
public class testPretenureSizeThreshold {
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
    -XX:PretenureSizeThreshold=3145728
    * */
    public static void main(String[] args){
        byte[] allocation;
        allocation = new byte[4*_1Mb];
    }
}
