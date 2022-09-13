
public class array {
    public static void main(String[] args) {
        array primitive_array = new array();
        primitive_array.primitiveType();

    }

    private void primitiveType() {

        int intarray[] = new int[1];
        double doublearray[] = new double[1];
        String str[] = new String[1];
        System.out.println(intarray[0]); // 0
        System.out.println(doublearray); // [D@24d46ca6
        System.out.println(new String[0]); // [Ljava.lang.String;@4517d9a3
        System.out.println(str[0]); // null
        
        // intarray[0] = 3;
        // System.out.println(intarray.toString());

    }

}
