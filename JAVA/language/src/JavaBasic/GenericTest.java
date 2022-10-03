package JavaBasic;

import java.util.ArrayList;

class Tv {

}

class Audio {

}

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv 타입 객체만 저장가능하다.
        Tv t = list.get(0);

        // ArrayList list = new ArrayList();
        // list.add(new Tv());
        // Tv t = (Tv) list.get(0); list 첫번째 요소를 꺼낸다.
        // // list.add(new Audio());
    }
}
