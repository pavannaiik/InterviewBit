public class Solution {
    public int solve(int[] A, int B) {
        int count=0,xor=0;
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<A.length;i++){
           xor^=A[i];
           if(xor==B)
           count++;
           if(map.containsKey(xor^B))
           count+=map.get(xor^B);
           map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
