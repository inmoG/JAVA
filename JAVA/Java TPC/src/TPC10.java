import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // int, float char boolean -> PDT

        // book 자료형을 만들어야 함 >> class로 만든다.
        BookDTO b = new BookDTO(); // 객체 생성
        b.title = "자바";
        b.price = 17000;
        b.company = "영진";
        b.page = 500;

        System.out.println(b.title + "\t");
        System.out.println(b.price + "\t");
        System.out.println(b.company + "\t");
        System.out.println(b.page + "\t");

    }
}
