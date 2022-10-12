package JavaBasic;

public class Ex13_7 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new Ex13_7());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println(i);

            if (i == 5)
                autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    } // main 종료

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("deamon"); // 3초마다 autoSave 값 확인
            // autoSave 값이 true이면 autoSave() 호출
            if (autoSave)
                autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동 저장되었습니다.");
    }
}
