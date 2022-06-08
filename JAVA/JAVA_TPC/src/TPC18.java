import kr.tpc.MovieVO;

public class TPC18 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = { 10, 20, 30, 40, 50 };
        int[] c = new int[] { 10, 20, 30, 40, 50 };

        for (int i = 0; i < a.length; i++) {
            System.out.println("a : " + a[i]);
            System.out.println("b : " + b[i]);
            System.out.println("c : " + c[i]);
        }

        // 영화(제목, 가격, 주인공, 등급, 시간)
        MovieVO movie = new MovieVO("범죄도시", 12000, "마동석", 15, 2.2f);
        System.out.println(movie);
        // System.out.println(movie.toString());

        System.out.println("---------------------------");
        // 영화 3편 저장을 위해 객체 배열 생성
        MovieVO[] Movie_arr = new MovieVO[3];

        // 데이터 할당
        Movie_arr[0] = new MovieVO("범죄도시", 12000, "마동석", 15, 2.2f);
        Movie_arr[1] = new MovieVO("범죄도시", 12000, "마동석", 15, 2.2f);
        Movie_arr[2] = new MovieVO("범죄도시", 12000, "마동석", 15, 2.2f);

        for (int i = 0; i < Movie_arr.length; i++) {
            System.out.println(Movie_arr[i].toString());
        }
    }
}
