package dataStructure.array;

import java.util.Arrays;

public class Chapter3_copy {
    public static void main(String[] args) {
        String[] folderA = { "MyCompter", "MyDocument" };
        String[] folderB = folderA;

        System.out.println("[사본 배열의 값 변경 전] 원본 배열" + Arrays.toString(folderA));

        folderB[0] = "newFolder";

        System.out.println("[사본 배열의 값 변경 후] 원본 배열" + Arrays.toString(folderA));
        System.out.println("[사본 배열의 값 변경 후] 사본 배열" + Arrays.toString(folderB));
    }
}
