package c.inheritance;

public class MemberEquals {
    public static void main(String[] args) {
        MemberEquals equals = new MemberEquals();
        // equals.equalMethod();
        equals.equalMethod2();
    }

    public void equalMethod() {
        Member member = new Member("inmo");
        Member member2 = new Member("inmo");

        if (member == member2) {
            System.out.println("member and member2 is same");
        } else {
            System.out.println("member and member2 is different");
        }
    }

    public void equalMethod2() {
        Member member = new Member("inmo");
        Member member2 = new Member("inmo");
        if (member.equals(member2)) {
            System.out.println(member.hashCode());
            System.out.println(member2.hashCode());
            System.out.println("member and member2 is same");

        } else {
            System.out.println("member and member2 is different");
        }
    }
}
