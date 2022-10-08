package JavaBasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        Collection list = new HashSet<>(); // set과 list는 Collection 인터페이스를 구현했기 때문에 참조변수 타입으로 Collection을 사용할 수 있다.
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator(); // iterator 객체 반환
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
