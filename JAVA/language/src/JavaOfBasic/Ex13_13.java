package JavaBasic;

public class Ex13_13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        ThreadGroup group = new Thread(r).getThreadGroup();
        System.out.println(group);
    }
}

class Account {
    private int balance = 1000; // instance var

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println(Thread.currentThread() + "출금금액: " + money);
            balance -= money;
        }
    }
}

class RunnableEx13 implements Runnable {
    Account acc = new Account();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300 한 값을 임의로 선택해 출금
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println(Thread.currentThread() + "남은 금액: " + acc.getBalance());
        }
    }
}