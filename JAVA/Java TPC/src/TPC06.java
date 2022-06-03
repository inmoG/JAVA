public class TPC06 {
    public static void main(String[] main) {
        int a = 67;
        int b = 98;
        int result = sum(a, b);
        System.out.println(result);
        int[] arr = makeArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        int v = a + b;
        return v;
    }

    public static int[] makeArr() {
        int x = 10, y = 20, z = 30;

        int[] arr = { x, y, z };
        return arr;

    }
}
