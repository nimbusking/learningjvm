package cc.nimbusk.allocation;

public class TestAllocation {

    private static final int ONE_MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * ONE_MB];
        allocation2 = new byte[2 * ONE_MB];
        allocation3 = new byte[2 * ONE_MB];
        allocation4 = new byte[4 * ONE_MB];
    }

}
