package JavaBasic;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] unit = { new Marine(), new Tank(), new Dropship() };
        for (int i = 0; i < unit.length; i++) {
            unit[i].move(100, 200);
        }
    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        // 현재 위치에 정지
    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ", y=" + y + "]");
    }

    void stimpack() {
        // 스팀팩 사용
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ", y=" + y + "]");
    }

    void changeMode() {
        // 공격모드로 전환한다.
    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }

    void load() {
        // 선택된 Unit을 태운다.
    }

    void unload() {
        // 선택된 대상을 내린다.
    }

}
