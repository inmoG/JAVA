import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        BookVO b1 = new BookVO();
        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b1.company);
        System.out.println(b1.page);
        System.out.println();

        BookVO b2 = new BookVO();
        System.out.println(b2.title);
        System.out.println(b2.price);
        System.out.println(b2.company);
        System.out.println(b2.page);
        System.out.println();

        BookVO b3 = new BookVO("python", 18000, "한빛", 500);
        System.out.println(b3.title);
        System.out.println(b3.price);
        System.out.println(b3.company);
        System.out.println(b3.page);
        System.out.println();
    }
}
