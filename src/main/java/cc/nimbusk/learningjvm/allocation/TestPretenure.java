package cc.nimbusk.learningjvm.allocation;

public class TestPretenure {

    private static final int ONE_MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * ONE_MB];
    }

}
