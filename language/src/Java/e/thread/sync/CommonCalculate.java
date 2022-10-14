package Java.e.thread.sync;

public class CommonCalculate {
    private int interest;
    private int amount;
    private Object amountLock = new Object();
    private Object interestLock = new Object();

    public CommonCalculate() {
        amount = 0;
    }

    // public synchronized void plus(int value) {
    // amount += value;
    // }

    // public synchronized void minus(int value) {
    // amount -= value;
    // }

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }
    }

    public synchronized void minus(int value) {
        synchronized (amountLock) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
