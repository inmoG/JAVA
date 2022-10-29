package Java_TPC;


public class TPC05 {
    public static void main(String[] main) {
        int[] arr = { 10, 20, 30 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        Random rand = new Random();
        int[][] b = new int[3][3]; // 가변배열은 new int[3][]
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = rand.nextInt(100);
                // System.out.println(b[i][j]);
            }
        }

        char[][] star = new char[5][];
        for (int i = 0; i < star.length; i++) {
            star[i] = new char[i + 1];
            for (int j = 0; j < star[i].length; j++) {
                star[i][j] = '*';
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}