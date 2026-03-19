package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY_OF_NUMBERS = 12;
    public static final int INITIAL_VALUE = -1;
    public static final int RETURN_VALUE = -1;
    public static final int DEFULT_VALUE = -1;
    private final int[] numbers = new int[CAPACITY_OF_NUMBERS];

    public int total = INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFULT_VALUE;
    }

    public boolean isFull() {
        return total == CAPACITY_OF_NUMBERS -1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
