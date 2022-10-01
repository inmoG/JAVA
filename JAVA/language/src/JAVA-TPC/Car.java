public class Car {
    int speed; // instance field;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void method1() {
        /*
         * static method는 instance field와 method를 사용 X
         * this.field = 10;
         * this.run();
         */

        // 인스턴스 멤버를 사용하고 싶다면 객체를 만들어 접근한다.
        Car obj = new Car();
        obj.speed = 10;
        obj.run();
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
        Car.method1();
    }
}
