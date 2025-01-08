public class Number {
    public static void main(String[] args) {
        // UTID-13が自分は0012024121173
        int d1 = 0,
            d2 = 0,
            d3 = 1,
            d4 = 2,
            d5 = 0,
            d6 = 2,
            d7 = 4,
            d8 = 1,
            d9 = 2,
            da = 1,
            db = 1,
            dc = 7,
            dd = 3;
        int v1 = d1 + d3 + d5 + d7 + d9 + db,
            v3 = d2 + d4 + d6 + d8 + da + dc,
            vv = ( v3 * 3 + v1 + dd ) % 10;
        System.out.println(vv);
    }
}