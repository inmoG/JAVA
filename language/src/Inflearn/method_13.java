package Inflearn;

public class method_13 {
    public static void main(String[] args) {
        FarmMachine machine = new FarmMachine();
        System.out.println(String.format("%,d", machine.price));
    }
}

class FarmMachine {
    public String color = "red";
    public int year = 2020;
    public int price = 1000000;

    public void move() {
        System.out.println("Farm-machine is moving.");
    }

    public void dig() {
        System.out.println("Fram-machine is digging.");
    }

    public void grind() {
        System.out.println("Fram-machine is grinding.");
    }
}
