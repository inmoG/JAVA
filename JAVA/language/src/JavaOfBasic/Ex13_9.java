package JavaBasic;

import java.util.Scanner;

public class Ex13_9 {
    public static void main(String[] args) {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        Scanner sc = new Scanner(System.in);
        System.out.print("아무 값이나 입력하세요: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println("입력하신 값은" + input + "입니다.");
        th1.interrupt(); // interrupt 호출하면 interrupted 상태 true로 변경
        System.out.println("isInterrupted(): " + th1.isInterrupted()); // true
    }
}

class ThreadEx9_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            // isInterrupted 기본값 false
            // intruppt 호출로 상태 true 변경 >> ! 만나 false로 while 빠져나오고 카운트 종료 출력
            System.out.println(i--);
            for (long x = 0; x < 2500000000L; x++)
                ; // 시간지연
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}