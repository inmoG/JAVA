package dataStructure;
import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        // 3 개수
        // 123 N개의 숫자
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개수 입력받기
        String sNum = sc.next(); // N값 입력받기
        sc.close();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
