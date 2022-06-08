import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

// import java.lang.*; // default package (생략)

public class TPC19 {
    public static void main(String[] args) {
        // 1. Java 에서 제공해주는 class .. API >> String, System
        // 자바에서 제공해주는 class, API는 import를 생략해서 제공한다.
        // 문자열(String)객체
        // java.lang.String str = new java.lang.String("APPLE");
        String str = new String("APPLE");
        System.out.println(str.toLowerCase()); // apple

        // 2. 직접 만들어서 사용하는 class, Dto
        MyUtil util = new MyUtil();
        int sum = util.hap();
        System.out.println(sum);

        // 3. 다른 회사에서 만들어 놓은 class, API
        // Gson > json : https://mvnrepository.com/
        Gson g = new Gson();
        BookVO vo = new BookVO("자바", 13000, "영진", 800);
        String json = g.toJson(vo);
        System.out.println(json);
        // {"title":"자바","price":13000,"company":"영진","page":800}
    }
}
