package Java.e.thread.support;

public class SimpleThreads {
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s : %s\n", threadName, message);
    }

    private static class MessageLoop implements Runnable {
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    // 4초간 중지한다.
                    Thread.sleep(4000); // MessageLoop Thread
                    // 메시지 출력
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                // TODO: handle exception
                threadMessage("I wasn`t done!");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long patience = 1000 * 60 * 60;

        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Runnable r = new MessageLoop();
        Thread t = new Thread(r, "MessageLoop"); // MessageLoop thread
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        while (t.isAlive()) {
            threadMessage("Still waiting...");

            System.out.println("Thread Name = " + Thread.currentThread().getName());
            System.out.println("Main Thread State = " + Thread.currentThread().getState());
            t.join(5000); // main thread는 messageLoop 스레드가 종료될 때 까지 5초 대기
            System.out.println("Main Thread State = " + Thread.currentThread().getState());
            System.out.println("MessageLoop state = " + t.getState());
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                threadMessage("Tired of waiting!!");
                t.interrupt();
                System.out.println("Message Loop thread state : " + t.getState());
                t.join(1000); // message loop thread가 작업할 시간인 1초를 부여한다. 따라서 main thread는 1초 대기한다.
                System.out.println("Message Loop thread state : " + t.getState());
            }
        }
        threadMessage("Finally!!");

    }

}
