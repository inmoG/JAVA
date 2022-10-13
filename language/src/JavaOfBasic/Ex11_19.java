package JavaBasic;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        rotate(list, 2); // 오른쪽으로 두 칸씩 이동
        System.out.println(list);

        swap(list, 0, 2); // 0번째 index와 2번째 index를 교환(swap)
        System.out.println(list);

        shuffle(list); // 저장된 요소의 위치를 랜덤으로 변경
        System.out.println(list);

        sort(list, reverseOrder()); // 역순정렬
        System.out.println(list);

        sort(list); // 정렬
        System.out.println(list);

        int idx = binarySearch(list, 3); // 3이 저장된 인덱스 반환
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));

        fill(list, 9); // list를 9로 채운다.
        System.out.println("list = " + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 결과는 변경불가하다.
        List newList = nCopies(list.size(), 2); // 사이즈가 6이면 6개 리스트를 만들어 2로 채운다.
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList));// list와 newList 간 공통요소가 없으면 true 반환

        copy(list, newList); // newList 내용을 list에 덮어씌운다.
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

    }
}
