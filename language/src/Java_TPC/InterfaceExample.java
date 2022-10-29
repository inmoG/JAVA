package Java_TPC;

public class InterfaceExample {
    public static void main(String[] args) {
        MemberManager member = new MemberManagerImpl();
        System.out.println(member.addMember(new MemberDTO("inmo")));
        System.out.println(member.removerMember("inmo", "010-1111-1111"));
        System.out.println(member.updateMember(new MemberDTO("inmo")));
    }
}
