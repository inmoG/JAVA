package dataStructure;

import java.util.Arrays;

public class chapter3_init {
    public static void main(String[] args) {
        int[] arr1 = new int[1];
        int[] arr2 = new int[] { 1, 2, 3 };
        int[] arr3 = { 1, 2, 3, 4, 5 };

        System.out.println("arr1: " + Arrays.toString(arr1) + ", length: " + arr1.length);
        System.out.println("arr2: " + Arrays.toString(arr2) + ", length: " + arr2.length);
        System.out.println("arr3: " + Arrays.toString(arr3) + ", length: " + arr3.length);
    }
}
