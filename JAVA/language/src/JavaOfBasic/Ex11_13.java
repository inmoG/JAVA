package JavaBasic;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// set의 add method는 데이터를 비교해 저장하므로 입력받는 데이터가 Comparable 또는 Comparator를 구현해 비교 기준을 만들어줘야 한다.
// 
// 
public class Ex11_13 {
    public static void main(String[] args) {

        // Set set = new HashSet(); 정렬을 안해주므로 linkedlist로 정렬 해야함
        Set set = new TreeSet<>(); // 범위 검색, 정렬을 해준다.
        // Set set = new TreeSet<>(TestComp);

        // for (int i = 0; set.size() < 6; i++) {
        // int num = (int) (Math.random() * 45) + 1; // 1 ~ 46 랜덤 출력
        // // set.add(new Integer(num)); // set.add(num);
        // set.add(new Test());
        // }
        set.add(new Test());
        set.add(new Test());
        System.out.println(set); // [5, 18, 19, 32, 36, 37] treeset은 정렬을 해준다.
    }
}

class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return -1;
    }
    // 비교 기준 없음

}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        return -1; // 값이 다름을 의미
    }

}