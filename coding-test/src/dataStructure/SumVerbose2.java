package dataStructure;

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.println("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(i + " + "); // 0 + 1 + 2 + 3 + 4 +
            sum += i;
        }
        System.out.print(n + "=" + (sum += n)); // 5 = 15;
    }
}
