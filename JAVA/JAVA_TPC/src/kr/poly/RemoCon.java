package kr.poly;

public interface RemoCon {

    // final static(상수) 사용 가능 final static 생략 가능
    public static final int MAXCH = 100;
    public static final int MINCH = 1;

    // 객체 생성 X remocon r = new remocon X
    // 추상 메서드
    public abstract void chUp();

    public void ChDown(); // abstract 생략

    public void internet(); // abstract 생략
}
