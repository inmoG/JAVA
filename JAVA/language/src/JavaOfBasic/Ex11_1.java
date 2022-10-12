package JavaOfBasic;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        // list1.add(new Integer(5));
        list1.add(5); // ArrayList는 객체만 저장가능하다. 하지만 기본형이 저장되는데 이는 autoBoxing에 의해 기본형이 참조형으로 자동 변환된다.
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList<>(list1.subList(1, 4)); // 1 index ~ 4 index : 4, 2, 0 추출해 list2에 할당
        print(list1, list2); // list1 : 5 4 2 0 1 3 | list2 4 2 0

        Collections.sort(list1); // list1 (5 4 2 0 1 3) 순서대로 정렬 >> 0 1 2 3 4 5
        Collections.sort(list2); // list2 (4 2 0) 순서대로 정렬 >> 0 2 4
        print(list1, list2); //

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); // list2 객체들이 list1에 포함되어 있는지
        list2.add("B"); // B 추가
        list2.add("C"); // C 추가
        list2.add(3, "A"); // 0 2 4 B C >> 0 2 4 A B C
        print(list1, list2);

        list2.set(3, "AA"); // 인덱스 3인 곳을 AA로 변경
        print(list1, list2); // 0 1 2 3 4 5 | 0 2 4 AA B C

        list1.add(0, "1");
        System.out.println(list1);
        System.out.println("index = " + list1.indexOf("1")); // String 1
        System.out.println("index = " + list1.indexOf(new Integer(1))); // Integer 1

        System.out.println("list1.retainAll(list2)" + list1.retainAll(list2)); // list1에서 list2와 겹치는 부분만 남기고 나머지 삭제

        print(list1, list2); // list1과 list2의 겹치는 부분 0 2 4 따라서 list1 = 0 2 4 | list2 = 0 2 4 AA B C

        // list2에서 list1에 포함된 객체 삭제
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) // list2 n 번째 idnex 값이 list1에 포함되어있는지 확인
                list2.remove(i); // 포함되어있다면 해당 인덱스 값을 삭제한다.
        }
        print(list1, list2);

        System.out.println("-----------------");

        ArrayList list3 = new ArrayList();
        list3.add("1");
        list3.add(2);
        list3.add(1);
        System.out.println(list3);
        list3.remove(1); // 1번째 인덱스 값을 삭제 >> 2 삭제
        System.out.println(list3); // 1 1
        list3.remove(new Integer(1)); // 값 1을 삭제
        System.out.println(list3); // 1

        for (int i = list3.size() - 1; i >= 0; i--) {
            list3.remove(i);
            System.out.println(list3);
        }
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
