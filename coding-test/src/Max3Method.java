public class Max3Method {
    public static void main(String[] args) {
        // System.out.println(max3(10, 5, 6));
        // System.out.println(min3(10, 6, 15));
        // System.out.println(max4(11, 20, 11, 6));
        System.out.println("중앙값은" + med3(3, 5, 4) + "입니다.");
    }

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }

    static int med3(int a, int b, int c) {
        // 6 5 10
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (b <= c)
            return b;
        else if (a <= c)
            return c;
        else
            return a;
    }

}
