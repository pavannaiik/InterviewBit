public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer>res=new ArrayList<Integer>();
        for(int i=0;i<A;i++)
        res.add(0);
        for(ArrayList<Integer>cur : B){
            int i=cur.get(0);
            int j=cur.get(1);
            int val=cur.get(2);
           res.set(i-1,res.get(i-1)+val);
           if(j<A){
               res.set(j,res.get(j)-val);
           }
        }
        for(int i=1;i<res.size();i++){
            res.set(i,res.get(i)+res.get(i-1));
        }
        return (res);
    }
}
