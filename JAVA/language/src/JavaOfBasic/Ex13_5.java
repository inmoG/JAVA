package JavaBasic;

import java.util.Scanner;

public class Ex13_5 {
    public static void main(String[] args) {
        Runnable r = new ThreadEx5_1();
        Thread t1 = new Thread(r);
        t1.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("아무 값이나 입력하세요. ");
        String input = sc.nextLine();
        sc.close();
        System.out.println("입력하신 값은 '" + input + "' 입니다.");
    }
}

class ThreadEx5_1 implements Runnable {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
