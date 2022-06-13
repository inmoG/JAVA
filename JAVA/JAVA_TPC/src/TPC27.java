
import kr.poly.*;

public class TPC27 {
    public static void main(String[] args) {
        // RemoCon으로 TV클래스 구동
        RemoCon r = new TV();
        for (int i = 0; i < 100; i++) {
            r.chUp();
        }
        for (int i = 100; i > 0; i--) {
            r.ChDown();
        }

        r.internet();
    }
}
