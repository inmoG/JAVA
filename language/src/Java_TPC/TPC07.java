package Java_TPC;

public class TPC07 {
    public static void main(String[] args) {
        int a = 20;
        float b = 56.7f;
        float v = sum(a, b); // call by value[값]
        System.out.println(v);

        int[] arr = { 1, 2, 3, 4, 5 };
        // 배열 총합=?
        int vv = arrSum(arr); // call by reference[번지]
        System.out.println(vv);
    }

    public static int arrSum(int[] x) {
        int hap = 0;
        for (int a = 0; a < x.length; a++) {
            hap += x[a];
        }
        return hap;
    }

    public static float sum(int a, float b) {
        float v = a + b;
        return v;
    }
}
