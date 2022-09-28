package c.enums;

public class PowerSwitchMan {
    public static void main(String[] args) {
        PowerSwitch powerSwitch = PowerSwitch.ON;
        displayByPowerSwitch(powerSwitch.opposite());
    }

    public static void displayByPowerSwitch(PowerSwitch powerSwitch) {
        if (powerSwitch == PowerSwitch.ON) {
            System.out.println("전원을 ON 합니다.");
        } else {
            System.out.println("전원을 OFF 합니다.");
        }

    }
}
