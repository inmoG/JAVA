package Java_TPC;


public class TPC16 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("inmo", 26, "010-1111-1111", "경기도");
        System.out.println(m.toString());

        MemberVO m1 = new MemberVO();
        m1.setAddr("경기도");
        m1.setAge(26);
        m1.setName("yeeun");
        m1.setTel("010-1111-1111");

        System.out.println(m1.getAddr());
        System.out.println(m1.getAge());
        System.out.println(m1.getName());
        System.out.println(m1.getTel());

        System.out.println(m1); // toString() 생략
    }
}
