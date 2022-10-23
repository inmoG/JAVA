package dataStructure.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// LinkedList는 List 인터페이스를 구현한다. ArrayList(not synch), vector(synch)

class MyData{
    int value;

    public MyData(int value){
       this.value = value;
    }
    static MyData create(int v){
        return new MyData(v);
    }

    @Override
    public String toString() {
        return ""+value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


public class list {
    public static void main(String[] args) {
        // LinkedList<MyData> list = new LinkedList<>(); List<> list = new LinkedList<>();
        // List<MyData> list = new Vector<>(); // 벡터타입인데 리스트타입으로도 표현 가능하다.
        List<MyData> list = new LinkedList<>();
        list.add(MyData.create(1));
        list.add(MyData.create(2));
        list.add(MyData.create(3));

        System.out.println(list);
        System.out.println(list.contains(MyData.create(2)));
        System.out.println(list.indexOf(MyData.create(3)));
        // System.out.println(list.size());
        // System.out.println(list.isEmpty());
        method1(list);


//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1, 5);
//        list.remove(2);

        // System.out.println(list);
        // System.out.println(list.get(2));
        // System.out.println(list.contains(5));  System.out.println(list.contains(Integer.valueOf(6)));

        List<MyData> arraylist = new ArrayList<>();
        arraylist.add(MyData.create(1));
        arraylist.add(MyData.create(2));

        method1(arraylist);
    }

    static void method1(List<MyData> list){
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
