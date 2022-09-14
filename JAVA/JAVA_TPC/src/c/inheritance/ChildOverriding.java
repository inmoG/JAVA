package c.inheritance;

public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    // public String printName() {
    // System.out.println("ChildOverriding printName()");
    // }

    public void printName() {
        System.out.println("ChildOverriding printName()");
    }
}
