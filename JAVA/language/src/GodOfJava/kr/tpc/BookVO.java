package kr.tpc;

// 책(Object) -> 제목, 가격, 출판사, 페이지 수 ...
public class BookVO {
    public String title;
    public int price;
    public String company;
    public int page; // property
    // default 생성자 생략

    public BookVO() {
        // 초기화

        this.title = "자바";
        this.price = 17000;
        this.company = "이지스";
        this.page = 600;
    }

    public BookVO(String title, int price, String company, int page) {
        // 생성자 메서드의 중복 정의 (overloading)
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
