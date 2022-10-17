package dataStructure.array;

import java.util.Arrays;

public class chapter3_deep_copy {
    public static void main(String[] args) {
        String[] folderA = { "myComputer", "myDocument" };
        String[] folderB = new String[folderA.length];

        System.out.println("[사본 배열의 값 변경 전] 원본 배열 : " + Arrays.toString(folderA));

        for (int i = 0; i < folderA.length; i++) {
            folderB[i] = folderA[i];
        }
        folderB[0] = "newFolder";

        System.out.println("[사본 배열의 값 변경 후] 원본 배열 : " + Arrays.toString(folderA));
        System.out.println("[사본 배열의 값 변경 전] 사본 배열 : " + Arrays.toString(folderB));
    }
}
