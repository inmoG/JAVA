package c.string;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        // sample.chechString();
        // sample.checkCompare();
        sample.checkCompareTo();
    }

    public void chechString() {
        String text = "오늘은피곤하다";
        System.out.println(text.length()); // 글자의 개수 출력 >> 7글자니까 7 출력
        System.out.println(text.getBytes().length); // getbytes() >> 글자 당 bytes 따라서 3 * 7 : 21
        text = "today";
        System.out.println(text.length());
        System.out.println(text.getBytes().length);
        System.out.println(text.isEmpty()); // 문자열이 비어 있는지 확인
        text = " ";
        System.out.println(text.isEmpty()); // false >> 공백도 문자열로 인식
        System.out.println(text.isBlank()); // true
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = "Check value";
        String text3 = "check value";
        // String text = new String("Check value");
        // String text2 = new String("Check value");
        if (text == text2) {
            System.out.println("text == text2 result is same");
        } else {
            System.out.println("text == text2 is different.");
        }
        if (text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same");
        }

        if (text.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase(text3) result is same");
        }
    }

    public void checkCompareTo() {
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text)); // 매개변수의 알파벳을 기준으로 앞이면 양수 뒤면 음수이다. a는 b보다 앞에 있으니 양수 1이 리턴된다.
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));
    }
}
