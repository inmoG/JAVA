package Java_TPC;

public class TPC13 {
    public static void main(String[] args) {
        // Inflearn inf = new Inflearn(); private 생성자를 사용해 객체 생성을 막음.
        // inf.java(); // instance method
        // Inflearn.tpc(); // class method
        // Inflearn.java2(); // class method
        // System sys = new System(); system is not visible
        // Math m = new Math(); // math is not visible
        System.out.println("system class는 private 생성자를 이용한다!");
        System.out.println("Math class는 private 생성자를 이용한다!" + Math.PI);
    }
}
