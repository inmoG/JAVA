public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor array = new ArrayNewFor();
        // array.newFor();
        array.twoDimFor();
    }

    private void twoDimFor() {
        int[][] twoDim = { { 1, 2, 3 }, { 4, 5, 6 } };
        int oneCounter = 0;
        for (int[] dimArray : twoDim) {
            int twoCounter = 0;
            for (int data : dimArray) {
                System.out.println(data);
                twoCounter++;
            }
            oneCounter++;
        }
    }

    private void newFor() {
        int[] oneDim = { 1, 2, 3, 4, 5, 6, 7 };
        for (int data : oneDim) {
            System.out.println(data);
        }
    }
}
