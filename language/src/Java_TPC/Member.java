package Java_TPC;


public class Member {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO("inmo", "010-1111-1111", "email@gmail.com");
        System.out.println(dto); // dto.toString();
    }
}
