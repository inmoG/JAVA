package JavaBasic;

// public class Fighter implements Fightable {
//     public void move(int x, int y) {
//         System.out.println("[x=" + x + ", y=" + y + "]");
//     }

//     public void attack(Unit u) {
//         System.out.println("공격!");
//     }
// }

// abstract class Fighter implements Fightable {
//     public void move(int x, int y) {
//         System.out.println("이동!");
//     }
// }

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {
        System.out.println("이동!" + x + y);
    }

    public void attack(Unit u) {
        System.out.println(u + "공격 !!");
    }
}
