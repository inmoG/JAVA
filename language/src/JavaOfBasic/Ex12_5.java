package JavaOfBasic;

import java.util.ArrayList;

interface Eatable {

}

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {

    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }

}

class Toy {
    public String toString() {
        return "Toy";
    }
}

public class Ex12_5 {
    public static void main(String[] args) {
        FruitBox<? extends Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<? extends Fruit> appleBox = new FruitBox<Apple>(); // FruitBox<? extends Fruit> 생략 FruitBox<Apple> >>
                                                                    // FruitBox<? extends Fruit>
        // FruitBox<? extends Fruit>() >> FruitBox<Apple>
        FruitBox<Apple> abox = (FruitBox<Apple>) appleBox; // 경고 발생 하지만 형변환 가능하다 형변환 표시 생략 불가
        abox.add(new Apple());
        System.out.println(abox);
        // // Box b = new Box<String>();
        // // b.add(new Integer(10));
        // // 원시타입에 지네릭을 할당하면 예상치 못한 타입이 삽입될 수 있다.
        // Box b =null;
        // Box<String> bStr = null;
        // b= (Box)bStr; // Box<String> >> Box : downcasting 가능 하지만 경고
        // bStr=Box(String)b; // Box b >> Box(String) : Upcasting 가능 하지만 경고
        // // 제네릭스와 원시타입 간 형변환은 바람직하지 않다.!!

        // Box<Object> objBox = null;
        // Box<String> strBox = null;
        // objBox = Box<Object>strBox; // Box<String> >> Box<Object> Error
        // strBox = Box<String>objBox; // Box<Object> >> Box<String> Error

        // // 와일드 카드 사용된 지네릭 타입으로는 가능
        // Box<Object> objbox = (Box<Object>)new Box<String>();
        // Box<? extends Object> wBox = (Box<? extends Object>)new Box<String>();
        // Box<? extends Object> wBox2 = new Box<String>(); // (Box<? extends Object>)
        // 생략
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
