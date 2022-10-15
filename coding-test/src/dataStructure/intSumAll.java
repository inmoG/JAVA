public class intSumAll {
    public static void main(String[] args) {
        int sum1 = sumOf(3, 5);
        int sum2 = sumOf(4, 6);
        System.out.format("%s, %s", sum1, sum2);
    }

    public static int sumOf(int a, int b) {
        int sum = 0;

        if (a <= b) {
            while (a <= b) {
                sum += a;
                a++;
            }
        } else if (b <= a) {
            while (b <= a) {
                sum += b;
                b++;
            }
        }
        return sum;
    }
}
