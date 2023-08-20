class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(i==x) map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.containsKey(x)){
            return map.get(x);
        }else{
            return 0;
        }
    }
}