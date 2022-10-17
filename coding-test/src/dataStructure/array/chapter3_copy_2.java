package dataStructure.array;

import java.util.Arrays;

public class chapter3_copy_2 {
    public static void main(String[] args) {
        String[] folderA = { "muComputer", "myDocument", "recycleBin" };
        System.out.println("clone() 메소드 호출");

        String[] folderB = folderA.clone();
        folderB[0] = "newFolder";

        System.out.println("원본 배열: " + Arrays.toString(folderA));
        System.out.println("사본 배열: " + Arrays.toString(folderB));

        System.out.println("\nSystem.arrayCopy() 메서드 호출");

        String[] folderC = new String[folderA.length];
        System.arraycopy(folderA, 0, folderC, 0, 2);
        folderC[0] = "newFolder";

        System.out.println("원본 배열: " + Arrays.toString(folderA));
        System.out.println("사본 배열: " + Arrays.toString(folderC));

        System.out.println("\nArrays.copyOf(...) 메서드 호출");

        String[] folderD = Arrays.copyOf(folderA, 1);
        folderD[0] = "newFolder";

        System.out.println("원본 배열: " + Arrays.toString(folderA));
        System.out.println("사본 배열: " + Arrays.toString(folderD));

        String[] folderE = Arrays.copyOfRange(folderA, 0, 1);
        folderE[0] = "newFolder";

        System.out.println("\nArrays.copyOfRange(...) 메서드 호출");
        System.out.println("원본 배열: " + Arrays.toString(folderA));
        System.out.println("사본 배열: " + Arrays.toString(folderE));

    }
}
