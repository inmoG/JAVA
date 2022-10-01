package d.lang;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();
        sample.integerMinMaxCheckBinary();
    }

    public void numberTypeCheck() {
        String value1 = "3";
        String value2 = "5";
        byte byte1 = Byte.parseByte(value1);
        byte byte2 = Byte.parseByte(value2); // parse >> 기본 자료형 리턴
        System.out.println(byte1 + byte2);

        Integer refInt1 = Integer.valueOf(value1); // valueOf >> 참조 자료형 리턴
        Integer refInt2 = Integer.valueOf(value2);
        System.out.println(refInt1 + refInt2 + "7");
    }

    public void numberMinMaxCheck() {
        System.out.println("Byte min : " + Byte.MIN_VALUE + "max : " + Byte.MAX_VALUE);
        System.out.println("Short " + Short.MIN_VALUE + Short.MAX_VALUE);
        System.out.println("Integer" + Integer.MIN_VALUE + Integer.MAX_VALUE);
        System.out.println("Long" + Long.MIN_VALUE + Long.MAX_VALUE);
        System.out.println("Float" + Float.MIN_VALUE + Float.MAX_VALUE);
        System.out.println("Double " + Double.MIN_VALUE + Double.MAX_VALUE);
        System.out.println("Character" + (int) Character.MIN_VALUE + (int) Character.MAX_VALUE);
    }

    public void integerMinMaxCheckBinary() {
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Hex" + Integer.toHexString(Integer.MIN_VALUE));
    }
}
