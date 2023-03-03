public class Cutting Rectangles {
    public static long fun(long L, long B){

        

        if(L == 0)return B;

        if(B == 0) return L;

        

        if(L == B) return L;

        if(L>B) return fun(L-B, B);

        return fun(L, B-L);

    }

    static List<Long> minimumSquares(long L, long B)

    {

        long x = 0, k = 0;

        x = fun(L, B);

        k = (L*B)/(x*x);

        List<Long> list = new ArrayList<>();

        list.add(k);

        list.add(x);

        return list;
    }
}
