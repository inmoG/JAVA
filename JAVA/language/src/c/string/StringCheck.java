package c.string;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();
        String[] addresses = { "서울시 구로구 신도림동", "경기도 성남시 분당구 정자동 네이버 신사옥", "서울시 구로구 개봉동" };
        // sample.checkAddress(addresses);
        // sample.containsAddress(addresses);
        // sample.checkMatch();
        // sample.checkLastIndexOf();
        // sample.checkSubstring();
        // sample.checkSplit();
        // sample.checkTrim();
        // sample.checkReplace();
        // sample.ValueOf(sample);
        sample.internCheck();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("Starts with : " + startText + " count is " + startCount);
        System.out.println("ends with : " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses) {
        int containCount = 0;
        String containText = "구로";
        for (String address : addresses) {
            if (address.contains(containText)) {
                containCount++;
            }
        }
        System.out.println("Contains " + containText + " count is " + containCount);
    }

    public void checkMatch() {
        String text = "this is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(4, compare1, 11, 0));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform.";
        int index = text.indexOf('a');
        System.out.println(text.charAt(index));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf() {
        String text = "Java technology is both a programming language and a platform.";
        char[] text2 = { 'a', 'b', 'c' };
        System.out.println(text.length());
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
        System.out.println("copyValueOf : " + String.copyValueOf(text2));
        char[] result = text.toCharArray();
        System.out.println(result);
    }

    public void checkSubstring() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        String result = text.substring(5, 9);
        CharSequence result2 = text.subSequence(5, 9);
        System.out.println(result);
        System.out.println(result2);
    }

    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    public void checkTrim() {
        String strings[] = new String[] { " a", " b ", "       c", "d     ", "e     f", "   " };
        for (String temp : strings) {
            System.out.println("org : [" + temp + "]");
            System.out.println("trim : [" + temp.trim() + "]");
        }

        String text = " a ";
        if (text != null && text.trim().length() > 0) {
            System.out.println("OK");
        } else {
            System.out.println("No");
        }
    }

    public void checkReplace() {
        String text = "The String class represents character strings";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println("replaceAll : " + text.replaceAll(" ", "|"));
        System.out.println("replaceFirst : " + text.replaceFirst(" ", "|"));
    }

    public void checkToIgnoreCase() {
        String text = "The String class represents character strings";
        text.toUpperCase();
    }

    public void ValueOf(StringCheck CheckSample) {
        byte b = 1;
        int a = 10;
        boolean c = true;
        String byte1 = String.valueOf(b);
        String byte2 = b + " is String";
        String int1 = String.valueOf(a);
        String bool1 = String.valueOf(c);
        String[] valueArray = new String[] {
                byte1, byte2, int1, bool1
        };

        for (String temp : valueArray) {
            if (temp instanceof String) {
                System.out.println(temp);
            } else {
                System.out.println(temp + " is not String");
            }
        }

        System.out.println("--------------------------------");

        try {
            CheckSample = null;
            if (CheckSample instanceof StringCheck) {
                System.out.println("StringCheck Type");
            } else {
                // System.out.println(CheckSample.toString());
                System.out.println(String.valueOf(CheckSample));
            }
        } catch (NullPointerException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");
        text3 = text3.intern();
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text1.equals(text3));
    }
}
