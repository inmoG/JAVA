package c.inheritance;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
        // thisObject.equalMethod2();
    }

    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("inmo");
        MemberDTO obj2 = new MemberDTO("inmo");

        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }

}
