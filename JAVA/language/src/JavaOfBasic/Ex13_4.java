package JavaBasic;

import java.util.Scanner;

public class Ex13_4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("아무 값이나 입력하세요. ");
        String input = sc.nextLine();
        sc.close();
        System.out.println("입력하신 값은 " + input + "입니다.");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1초간 시간 지연
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
