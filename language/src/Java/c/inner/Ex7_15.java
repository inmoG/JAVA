package Java.c.inner;

public class Ex7_15 {
    public static void main(String[] args) {
        Outer2 oc = new Outer2();
        Outer2.InstanceInner il = oc.new InstanceInner();
        System.out.println(il.iv);

        System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);

        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println(si.iv);
    }
}
