public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int curMax=A.get(0),max=A.get(0);
        for(int i=1;i<A.size();i++){
            curMax=Math.max(A.get(i),curMax+A.get(i));
            max=Math.max(max,curMax);
        }
        return max;
    }
}
