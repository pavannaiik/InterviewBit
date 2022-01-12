/*Problem Description

You are given a binary string A(i.e. with characters 0 and 1) consisting of characters A1, A2, …, AN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, …, AR. By flipping, we mean change character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d. */

public class Solution {
    public ArrayList<Integer> flip(String A) {
        int max=0,count=0;
        int start=0,end=-1,temp=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='0')
            count++;
            else count--;
            if(count>max){
                max=count;
                start=temp;
                end=i;
            }
            if(count<0){
                count=0;
                temp=i+1;
            }
        }
        if(end==-1)
        return new ArrayList<>();
        return new ArrayList(Arrays.asList(start+1,end+1));
    }
}
