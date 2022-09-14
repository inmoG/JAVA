package godOfJava;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        // MemberDTO dto = new MemberDTO();
        MemberDTO dto1 = new MemberDTO("inmo");
        MemberDTO dto2 = new MemberDTO("inmo", "010-1111-1111");
        MemberDTO dto3 = new MemberDTO("inmo", "010-1111-1111", "inmo@naver.com");

    }
}
