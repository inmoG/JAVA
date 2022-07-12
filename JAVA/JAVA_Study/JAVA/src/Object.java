import Object.Car;

public class Object {
    public static void main(String[] args) {
        Car IONIQ5 = new Car(); // 인스턴스 생성
        IONIQ5.battery = "삼성";
        IONIQ5.company = "현대";
        IONIQ5.tire = "금호";
        System.out.println(IONIQ5.company);
        System.out.println(IONIQ5.battery);
        System.out.println(IONIQ5.tire);
    }

}
