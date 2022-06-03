public class App {
    public static void main(String[] args) throws Exception {
        String strVar1 = "양인모";
        String strVar2 = "양인모";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("양인모");
        String strVar4 = new String("양인모");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }

        // int v1 = 15;
        // if (v1 > 10) {
        // // int v2;
        // // v2 = v1 - 10;

        // }
        // int v3 = v1 + v2 + 5; // v2 는 if {}에서 선언하였기에 if 밖에서 사용할 수 없다.
        // byte < short < int <long < float < double
        // byte bytevalue = 10;
        // int intvalue = bytevalue;
        // System.out.println(intvalue);

        // int intValue = 44032;
        // char charValue = (char) intValue;
        // System.out.println(charValue);

        // long longValue = 500;
        // intValue = (int) longValue;
        // System.out.println(intValue);

        // double doubleValue = 3.14;
        // intValue = (int) doubleValue;
        // System.out.println(intValue);

    }
}
