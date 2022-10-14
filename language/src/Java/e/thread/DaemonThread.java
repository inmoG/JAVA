package Java.e.thread;

public class DaemonThread extends Thread {
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE); // Long 최댓값
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
