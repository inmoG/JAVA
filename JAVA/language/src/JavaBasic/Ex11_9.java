package JavaBasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4" };
        // Set set = new HashSet<>();
        Set set = new LinkedHashSet<>(); // 저장 순서를 유지하고 싶으면 LinkedHashSet 사용
        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);

        Iterator it = set.iterator(); // iterator 객체 가져오기

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
