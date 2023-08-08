class Solution {
    public static int countFractions(int n, int[] nu, int[] d) {
        int ans =0;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = nu[i];
            int y = d[i];
            if(x>y)
                continue;
            int z = gcd(x,y);
            x/=z;
            y/=z;
            if(map.containsKey(y)){
                map.get(y).add(x);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(x);
                map.put(y,list);
            }
        }
        for(Map.Entry<Integer,List<Integer>> x:map.entrySet()){
            int sum = x.getKey();
            List<Integer> list = x.getValue();
            if(list.size()==1)
                continue;
            HashMap<Integer,Integer> m = new HashMap<>();
            for(int f : list){
                m.put(f,m.getOrDefault(f,0)+1);
            }
            for(Map.Entry<Integer,Integer> y : m.entrySet()){
                if(sum-y.getKey()==y.getKey()){
                    int h = y.getValue(); 
                    ans += (h*(h-1));
                }else if(m.containsKey(sum-y.getKey()))
                    ans+=(y.getValue()*m.get(sum-y.getKey()));
            }
        }
        return ans/2;
    }
    static int gcd(int a, int b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
