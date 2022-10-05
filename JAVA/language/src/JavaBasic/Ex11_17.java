package JavaBasic;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet(); // key, value 함께 반환
        // System.out.println(set); // [안자바=90, 김자바=100, 강자바=80, 이자바=100]
        Iterator it = set.iterator();

        while (it.hasNext()) {
            // Object next = it.next();
            // System.out.println(next); 안자바=90
            Map.Entry e = (Map.Entry) it.next(); // map 메서드를 쓰기 위해 형변환
            // System.out.println(e); // 김자바=100
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet(); // key 가져오기
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = (int) it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));

    }
}
