package dataStructure;

import java.util.Scanner;

public class SumGauss {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1에서 n까지의 총합을 구합니다.");
        System.out.print("n의 값 : "); // 6
        int n = stdIn.nextInt();
        /*
         * 1 6
         * 2 5
         * 3 4
         * 4 3
         * 5 2
         * 6 1
         * 
         * 7
         * 
         * 1 7
         * 2 6
         * 3 5
         * 4 4
         * 
         * 
         * 1 9
         * 2 7
         * 3 6
         * 4 5
         * 5 5
         */

        // int sum = (n+1) * (n/2) + (n%2 == 1 ? (n+1) / 2:0);

        int sum;
        sum = (1 + n) * (n / 2); // 맨 앞과 맨 끝 정수 합을 구하는 식
        // 2를 나누는 이유는 계산을 n/2 번만 하기 때문이다.

        if (n % 2 != 0) {
            sum += ((1 + n) / 2);
            // 정수 개수가 홀수면 가운데 한 개의 숫자가 남는다. 따라서 2를 나눠서 sum에 더한다.
            // * 1 7
            // * 2 6
            // * 3 5
            // * 4 4

            // * 1 9
            // * 2 7
            // * 3 6
            // * 4 5
            // * 5 5
        }

        System.out.println("sum : " + sum);
    }
}
