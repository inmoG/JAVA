package dataStructure.array;

public class chapter3_multiArray_3 {
    public static void main(String[] args) {
        int[][] arr = new int[8][9];

        for (int i = 0, k = 2; i < arr.length; i++, k++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = k * (j + 1);

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 9; j++) {
                if (j != 0 && j % 3 == 0) {
                    System.out.println("");
                }
                System.out.print((i + 2) + "x" + (j + 1) + "=" + arr[i][j]);
                System.out.println(" ");
            }
        }
    }
}
