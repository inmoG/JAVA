package JavaBasic;

// public class Fighter implements Fightable {
//     Figther 클래스가 Fightable 인터페이스를 구현한다.
//     public void move(int x, int y) {
//         System.out.println("[x=" + x + ", y=" + y + "]");
//     }

//     public void attack(Unit u) {
//         System.out.println("공격!");
//     }
// }

// abstract class Fighter implements Fightable {
//     Fighter 추상 클래스가 Fightable 인터페이스의 메서드 일부를 구현한다.
//     public void move(int x, int y) {
//         System.out.println("이동!");
//     }
// }

class Fighter extends Unit implements Fightable {
    // Fighter 클래스가 Unit 추상 클래스를 상속받고 Fightable 인터페이스를 구현한다.
    public void move(int x, int y) {
        System.out.println("이동!" + x + y);
    }

    // public void attack(Unit u) {
    // System.out.println(u + "공격 !!");
    // }
    public void attack(Fightable f) {
        System.out.println(f + "공격!");
    }

    public Fightable method() {
        return new Fighter();
    }

}
