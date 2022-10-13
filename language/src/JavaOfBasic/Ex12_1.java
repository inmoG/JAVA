package JavaBasic;

import java.util.ArrayList;
import java.util.List;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        // ArrayList<Product> tvList2 = new ArrayList<Tv>(); // 다형성 X 에러
        List<Tv> tvList3 = new ArrayList<Tv>(); // Ok 다형성 >> 제네릭 간 다형성은 가능하다.

        productList.add(new Tv()); // Type Product public boolean add(Product e) {
        productList.add(new Audio());

        tvList.add(new Tv());
        // tvList.add(new Audio()); incompatible types: Audio cannot be converted to Tv
        tvList3.add(new Tv());

        printProductAll(productList);
        printArrayListTvAll(tvList);
        printListTvAll(tvList3);
    }

    public static void printProductAll(ArrayList<Product> productList) {
        // printAll(ArrayList<Product> tvList) >> 다형성 error
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public static void printListTvAll(List<Tv> TvList) {
        for (Tv t : TvList) {
            System.out.println("List <tv> : " + t);
        }
    }

    public static void printArrayListTvAll(ArrayList<Tv> TvList) {
        for (Tv t : TvList) {
            System.out.println("ArrayList <tv> : " + t);
        }
    }
}
