package Inflearn;

public class method_07 {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 100;
        a[1] = 200;
        sum(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        Integer b = new Integer(100);
        IntegerSum(b);
        System.out.println(b);
    }

    public static void sum(int[] a) {
        a[0] += 400;
        a[1] += 100;
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static void IntegerSum(Integer a) {
        a += 100;
        System.out.println(a);
    }
}
