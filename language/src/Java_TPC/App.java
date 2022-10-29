package Java_TPC;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int intArray[] = new int[3];
        System.out.println(intArray.toString()); // [I@24d46ca6
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(intArray); // intArray.toString(); >> [I@24d46ca6
        System.out.println(new int[1]); // [I@4517d9a3
    }
}