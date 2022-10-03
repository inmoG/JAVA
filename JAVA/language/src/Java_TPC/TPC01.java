import GodOf.book.Book;
import GodOf.book.Person;

public class TPC01 {
    public static void main(String[] args) {
        Book b;
        b = new Book(); // 객체 생성 > 객체의 주소 값을 b 변수에 저장
        // b는 인스턴스 변수 or 객체변수라 부른다. 즉 b는 객체이다.

        b.title = "혼자 공부하는 자바";
        b.price = 16900;
        b.company = "한빛미디어";
        b.page = 400;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);
        System.out.println("-------------------------");
        Person p;
        p = new Person();
        p.name = "양인모";
        p.age = 26;
        p.weight = 77;
        p.height = 166;

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.height);
    }
}
