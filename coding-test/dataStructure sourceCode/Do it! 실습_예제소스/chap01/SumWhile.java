// while 문으로 1, 2, …, n의 합을 구함

import java.util.Scanner;

class SumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
         System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;            // 합
        int i = 1;

        while (i <= n) {        // i가 n 이하면 반복
            sum += i;           // sum에 i를 더함
            i++;                // i 값을 1 증가(increment)
        }
        System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
    }
}