package Java_TPC;

import Java.kr.tpc.JavaMysql;

public class TPC28 {
    public static void main(String[] args) {
        // oracle , mysql -> Driver class
        DBconnect conn = new JavaMysql();
        conn.getConnection("url", "inmo", "1234");
        conn = new JavaOracle();
        conn.getConnection("url", "root", "12345");
    }
}