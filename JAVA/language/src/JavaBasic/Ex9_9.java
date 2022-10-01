package JavaBasic;

import java.util.StringJoiner;

public class Ex9_9 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/");
        for (CharSequence i : arr) {
            sj.add(i);
        }
        System.out.println(sj);

        sj = new StringJoiner("/", "(", ")");
        for (CharSequence i : arr) {
            sj.add(i);
        }
        System.out.println(sj);
    }
}
