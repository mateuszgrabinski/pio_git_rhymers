package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int REJECTED_VALUE = 0;
    private int totalRejected = REJECTED_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaBoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
