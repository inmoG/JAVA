package dataStructure.array;

import java.util.Random;

public class chapter3_loop_3 {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_LENGTH = 100;

        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr[i] = random.nextInt(100);
        }

        int min = 0;
        int max = 0;

        for (int k : arr) {
            if (k < min) {
                min = k;
            } else if (k > max) {
                max = k;
            }
        }

        System.out.println("최솟값: " + min);
        System.out.println("최댓값: " + max);
    }

}
