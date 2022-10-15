import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        int sum = 0;
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n을 입력하세요 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        stdIn.close();
        System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
    }
}