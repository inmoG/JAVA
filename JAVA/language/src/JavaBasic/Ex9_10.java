package JavaBasic;

public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int >> string

        double dVal = 200.0;
        String strVal2 = dVal + ""; // double >> String : 기본 자료형은 "" 빈 문자열을 더 해주면 String이 된다.
        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2); // "+" 부호
        System.out.println(sum);
        System.out.println("-------------");
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
        System.out.println(sum2);

        // int val = Integer.parseInt(" 123 ".trim()); 문자열 양 끝 공백을 제거 후 변환
    }
}
