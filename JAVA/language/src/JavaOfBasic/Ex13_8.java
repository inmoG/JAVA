package JavaBasic;

public class Ex13_8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

        try {
            th1.sleep(2000); // 실제 영향받는 것은 main메서드를 실행하는 main 쓰레드이다.
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        System.out.print("<<main 종료>>");
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.println("-");
        System.out.print("<<th1 종료>>");
    } // run
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.println("|");
        System.out.print("<<th2 종료>>");
    }
}