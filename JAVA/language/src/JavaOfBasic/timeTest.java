package JavaBasic;

class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isNotValidHour(hour))
            return; // hour < 0 || hour > 23 >> true일 경우 입력한 시간대 무시
        this.hour = hour;
    }

    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23; // true return;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}

public class timeTest {
    public static void main(String[] args) {
        Time time = new Time();
        time.setHour(11);
        time.setHour(25);
        System.out.println(time.getHour());
    }
}
