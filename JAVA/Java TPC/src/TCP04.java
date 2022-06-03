public class TCP04 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        // hap(a, b, c); // func 호출

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        hap1(arr);
    }

    public static void hap(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println(sum);
    }

    public static void hap1(int[] x) {
        int sum = 0;
        // for, while 활용
        for (int y = 0; y < x.length; y++) {
            sum += x[y];
        }
        System.out.println("hap" + sum);
    }
}
