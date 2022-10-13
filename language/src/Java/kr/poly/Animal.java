package Java.kr.poly;

// 기능이 비슷한 클래스는 추상 클래스로 묶어 사용
public abstract class Animal { // 추상클래스(불완전한 객체)
    // animal ani = new animal(); >> X
    // dog, cat >> eat()
    public abstract void eat(); // 추상 메서드(불완전한 메서드)

    public void move() {
        System.out.println("무리를 지어서 이동한다.");
    }

    public Animal() {
        super(); // new object();
    }
}
