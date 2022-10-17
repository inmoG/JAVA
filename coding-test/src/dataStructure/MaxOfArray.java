package dataStructure;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = stdIn.nextInt(); // 사람 수

        int[] height = new int[num]; // ex 5 >> 5개 배열 생성

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = stdIn.nextInt(); // 값 입력
        }

        System.out.println("최댓값은" + maxOf(height) + "입니다.");
    }
}
