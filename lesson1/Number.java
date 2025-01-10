public class Number {
    public static void main(String[] args) {
        int d1 = 0,
            d2 = 0,
            d3 = 0,
            d4 = 0,
            d5 = 0,
            d6 = 0,
            d7 = 0,
            d8 = 0,
            d9 = 0,
            da = 0,
            db = 0,
            dc = 0,
            dd = 0;
        int v1 = d1 + d3 + d5 + d7 + d9 + db,
            v3 = d2 + d4 + d6 + d8 + da + dc,
            vv = ( v3 * 3 + v1 + dd ) % 10;
        System.out.println(vv);
    }
}