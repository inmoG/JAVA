import kr.tpc.Overload;

public class TPC17 {
    public static void main(String[] args) {
        // 1+1, 23.4+56, 56.7+54.4
        Overload ov = new Overload();
        ov.hap(50, 50); // ov.hap_int_int(50,50)
        ov.hap(23.4f, 56); // ov.hap_float_int(23.4f, 56)
        ov.hap(56.7f, 34.f); // ov.hap_float_float(56.7f, 34.f)

    }
}
