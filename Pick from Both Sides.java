/* Problem Description

Given an integer array A of size N.

You can pick B elements from either left or right end of the array A to get maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick. */

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int curSum=0;
        for(int i=0;i<B;i++)
        curSum+=A.get(i);
        int max=curSum;
        int include=A.size()-1,exclude=B-1;
        while(include>=0 && exclude>=0){
            curSum+=A.get(include--);
            curSum-=A.get(exclude--);
            max=Math.max(max,curSum);
        }
        return max;
    }
}
