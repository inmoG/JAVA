package Java_TPC;

public class TPC14 {
    public static void main(String[] args) {
        // 책 > class(BookDTO) > 객체 > 인스턴스
        String title = "스프링";
        int price = 25000;
        String company = "제이펍";
        int page = 890;

        BookDTO dto; // dto(Object: 객체) dto는 책을 담는 변수이나 가리키는 데이터가 없으므로 object
        dto = new BookDTO(title, price, company, page); // dto(Instance: 인스턴스)
        bookPrint(dto);
    }

    public static void bookPrint(BookDTO dto) {
        System.out.println(dto.title);
        System.out.println(dto.price);
        System.out.println(dto.company);
        System.out.println(dto.page);
    }
}
