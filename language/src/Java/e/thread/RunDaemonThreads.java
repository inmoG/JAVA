package Java.e.thread;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.runDaemonThread();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("thread1 id= " + thread1.getId());
        System.out.println("Thread2 id= " + thread2.getId());

        System.out.println("thread1 name=" + thread1.getName());
        System.out.println("thread2 name=" + thread2.getName());

        System.out.println("thread1 priority=" + thread1.getPriority());

        daemonThread.setDaemon(true); // daemon thread로 사용한다.
        System.out.println("thread1 isDaemon=" + thread1.isDaemon());
        System.out.println("daemon thread isDaemon=" + daemonThread.isDaemon());
    }

    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.start();
    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
