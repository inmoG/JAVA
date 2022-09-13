package godOfJava;

public class MemberDTO {
    public String name; // instance variable
    public String email;
    public String phone;
    public int age;

    public MemberDTO() {
        // // 아무 정보도 모를 때
    }

    public MemberDTO(String name) {
        // 이름만 알 때
        this.name = name;
    }

    public MemberDTO(int age) {
        this.age = age;
    }

    public MemberDTO(String name, String phone) {
        // 이름과 전화번호만 알 때
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email) {
        // 모든 정보를 알고 있을 때
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("inmo");
    }
    // public MemberDTO getMemberDTO() {
    // MemberDTO dto = new MemberDTO();
    // return dto;
    // }
}
