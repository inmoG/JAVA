package JavaBasic;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num)); // set.add(num) >> 컴파일이 new Integer 생략해줌
        }

        List list = new LinkedList<>(set); // LinkedList(Collection c)
        Collections.sort(list);
        System.out.println(list);
        // LinkedList는 정렬을 해주지만 LinkedHashSet은 저장된 순서를 유지해줄 뿐 정렬을 해주지는 않는다. set은 중복
        // 허용하지않고 저장되는 순서도 제각각이다.
        // System.out.println(set);
        // Set linkedhashset = new LinkedHashSet<>(set);
        // System.out.println(linkedhashset);
    }
}
