package Java_TPC;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();

        // public 접근
        // m.name = "inmo";
        // m.age = 26;
        // m.tel = "010-1111-1111";
        // m.addr = "경기도";

        // System.out.println(m.name);
        // System.out.println(m.age);
        // System.out.println(m.tel);
        // System.out.println(m.addr);

        // private 접근
        m.setName("inmo");
        m.setAge(26);
        // m.setAge(101); Error >> 0
        m.setAddr("geoug-gi-do");
        m.setTel("010-1111-1111");
        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getAddr());
        System.out.println(m.getTel());

    }
}
