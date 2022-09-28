public class TPC09 {
    public static void main(String[] args) {
        int a = 56;
        int b = 40;
        TPC09 tpc = new TPC09(); // heap area 생성
        int v = tpc.sum(a, b);
        System.out.println(v);
    }

    public int sum(int a, int b) {
        int v = a + b;
        return v;
    }
}
