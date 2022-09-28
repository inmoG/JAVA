import kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        BookVO b = new BookVO();
        b.title = "파이썬";
        b.price = 16000;
        b.company = "에이콘";
        b.page = 700;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);

    }
}
