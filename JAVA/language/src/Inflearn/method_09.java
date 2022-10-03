package Inflearn;

import java.util.Arrays;

public class method_09 {
    public static void main(String[] args) {
        int[] a = testMethod();
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println("toString 사용 : " + Arrays.toString(a));
    }

    public static int[] testMethod() {
        int[] result = { 100, 200 };
        return result;
    }
}
