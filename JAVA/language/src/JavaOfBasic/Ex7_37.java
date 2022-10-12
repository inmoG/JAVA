package JavaBasic;

public class Ex7_37 {
    public static void main(String[] args) {
        Fightable f = new Fighter();
        f.attack(new Fighter());
        f.move(10, 20);
        System.out.println(f.method());

        // Unit u = new Fighter();
        // u.move(10, 20);
        // Attackable u = new Fighter();
        // Fightable u = new Fighter();
        // Movable u = new Fighter();
        // u.move(10, 20);
        // u.attack(new Marine());
    }
}
