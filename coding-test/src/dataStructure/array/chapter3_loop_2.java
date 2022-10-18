package dataStructure.array;

import java.util.Arrays;

public class chapter3_loop_2 {
    public static void main(String[] args) {
        int[] students = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("변경 전: " + Arrays.toString(students));

        int[] students2 = new int[students.length]; // 학생 길이만큼 배열 생성
        for (int i = 0; i < students.length; i++) {
            students2[(students.length - 1) - i] = students[i];
            // students2[9] = 1 (students[i]) >> students2[8] = 2 (students[i])
        }

        System.out.println("변경 후: " + Arrays.toString(students2));
    }
}
