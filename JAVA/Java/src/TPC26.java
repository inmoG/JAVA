import kr.poly.*;

public class TPC26 {
    public static void main(String[] args) {
        // Remocon r = new RemoCon();
        RemoCon r = new TV();
        r.chUp();
        r.ChDown();
        r.internet();
        r = new Radio();
        r.chUp();
        r.ChDown();
        r.internet();
        System.out.println(r.MAXCH);
        System.out.println(r.MINCH);

    }
}