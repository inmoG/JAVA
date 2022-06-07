public class Array {
    public static void main(String[] args) {
        // 자료형 [] 변수명
        // 자료형 변수명 []
        String[][] star = new String[5][];
        for (int i = 0; i < star.length; i++) {
            star[i] = new String[i + 2]; // star[0] = 1; >> star[1] = 2; star[2] = 3;
            for (int j = 0; j < star[i].length; j++) {
                star[i][j] = "*";
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}