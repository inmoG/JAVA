public class Array {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            // 2번 돈다.
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                // englishScores[0], englishScores[1] >> 2, 3개
                System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
            }
        }
        System.out.println();

        int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
        for (int i = 0; i < javaScores.length; i++) {
            // 2번 돈다
            for (int k = 0; k < javaScores[i].length; k++) {
                // i만큼 돈다.
                System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
            }
        }
        System.out.println();

        String[] strArray = new String[4];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        strArray[3] = "Java";

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0] == strArray[3]);
        System.out.println(strArray[0].equals(strArray[2]));

    }
}
