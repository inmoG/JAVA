package dataStructure;

public class Practice01_2 {
    public static void main(String[] args) {
        int max = maxValue(20, 31, 15, 31, 7);
        System.out.println("최댓값: " + max);
    }

    private static int maxValue(int data1, int data2, int data3, int data4, int data5) {
        int max = data1;

        if (max < data2) {
            max = data2;
        }

        if (max < data3) {
            max = data3;
        }

        if (max < data4) {
            max = data4;
        }

        if (max < data5) {
            max = data5;
        }

        return max;
    }
}
