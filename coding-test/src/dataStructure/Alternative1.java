package dataStructure;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        n = stdIn.nextInt();

        for (int i = 1; i <= n / 2; i++) {
            System.out.print("+-"); // 짝수
        }
        if (n % 2 != 0) {
            System.out.print("+"); // 홀수
        }
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0) {
        // System.out.print("+");
        // } else {
        // System.out.print("-");
        // }
        // }

    }
}
