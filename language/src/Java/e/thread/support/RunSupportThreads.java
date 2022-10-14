package Java.e.thread.support;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
    }

    public void checkThreadState1() {
        SleepThread thread1 = new SleepThread(2000); // 쓰레드가 2초동안 대기하도록 선언
        try {
            System.out.println("thread state = " + thread1.getState()); // 쓰레드 상태를 출력
            thread1.start();
            System.out.println("thread state(after start)=" + thread1.getState());

            Thread.sleep(1000); // 1초동안 대기
            System.out.println("Thread state (after 1 sec=" + Thread.currentThread());
            System.out.println("thread1 state(after 1 sec=" + thread1.getState());

            thread1.join(); // 쓰레드1이 끝날 때까지 기다리도록 함
            System.out.println("thread1 state(after join)=" + thread1.getState());
            thread1.interrupt(); // 쓰레드가 종료된 이후 interrupt 메소드 호출 >> 쓰레드가 종료된 상태이므로 예외없이 다음 줄로 넘어감
            System.out.println("thread1 state(after join)=" + thread1.getState());
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread thread2 = new SleepThread(2000);
        try {
            thread2.start();
            thread2.join(500); // thread2가 일시정지 상태
            thread2.interrupt(); // interrupt 호출해 대기 중인 쓰레드를 깨움
            System.out.println("thread2 state(after join)=" + thread2.getState());
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("thread2 state(after join)=" + thread2.getState());
            e.printStackTrace();
        }
    }
}
