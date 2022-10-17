package dataStructure;

public class intSumAll {
    public static void main(String[] args) {
        int sum1 = sumOf(3, 5);
        int sum2 = sumOf(4, 6);
        System.out.format("%s, %s", sum1, sum2);
    }
    static int sumOf(int a, int b) {

        // 예제 코드
        int min;
        int max;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}






