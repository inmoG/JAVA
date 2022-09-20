package c.inheritance;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);

        // System.out.println(this);
        // System.out.println(toString());
        // System.out.println("plus " + this);
    }

    public String toString() {
        return "ToSTring Class";
    }
    // public void toStringMethod() {
    // // System.out.println(obj);
    // // System.out.println(obj.toString());
    // // System.out.println("plus " + obj);

    // System.out.println(this);
    // System.out.println(toString());
    // System.out.println("plus " + this);
    // }
}
