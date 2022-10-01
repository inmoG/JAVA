import kr.tpc.DBconnect;
import kr.tpc.JavaMysql;
import kr.tpc.JavaOracle;

public class TPC28 {
    public static void main(String[] args) {
        // oracle , mysql -> Driver class
        DBconnect conn = new JavaMysql();
        conn.getConnection("url", "inmo", "1234");
        conn = new JavaOracle();
        conn.getConnection("url", "root", "12345");
    }
}