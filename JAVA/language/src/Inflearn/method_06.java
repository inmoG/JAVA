package Inflearn;

public class method_06 {
    public static void main(String[] args) {
        int a = 100;
        sum(a); // 500
        System.out.println(a); // 100
    }

    public static void sum(int a) {
        a += 400;
        System.out.println(a);
    }
}
