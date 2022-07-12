package Object;

public class Car {
    // class 설계도
    public String company;
    public String tire;
    public String battery;

    public Car() {
        super();
    }

    public Car(String company, String tire, String battery) {
        this.company = company;
        this.tire = tire;
        this.battery = battery;
    }
}
