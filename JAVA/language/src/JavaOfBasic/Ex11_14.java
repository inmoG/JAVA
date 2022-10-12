package JavaBasic;

import java.util.TreeSet;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();

        String from = "b";
        String to = "e";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("disc");
        set.add("elephant");
        set.add("eo");

        System.out.println(set);
        System.out.println("range search : from " + from + "to " + to);
        System.out.println("result1 : " + set.subSet(from, to)); // 첫 글자가 b ~ d 문자를 만족하는 문자열 출력
        System.out.println("result2 :" + set.subSet(from, to + "phant"));
    }
}
