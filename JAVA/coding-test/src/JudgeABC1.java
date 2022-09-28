import java.util.Scanner;

public class JudgeABC1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        stdIn.close();
        if (n == 1) {
            System.out.println("A");
        } else if (n == 2) {
            System.out.println("B");
        } else if (n == 3) {
            System.out.println("C");
        } else {
            ;
        }
        System.out.println("-------------");
        int x = 5;
        int y = 10;
        int c = 10;
        int a = (x > y) ? x : y;
        System.out.println(a);
        System.out.println((c == 0) ? "c는0" : "c는 0이 아님");
    }
}
