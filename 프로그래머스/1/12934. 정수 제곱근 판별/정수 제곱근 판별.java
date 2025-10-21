class Solution {
    public long solution(long n) {
        //long answer = -1;
        long root = (long)Math.sqrt(n);
        if(root * root == n) {
            //answer = ((int)root + 1) * ((int)root + 1);
            return (root + 1) * (root + 1);
        }
        else return -1;
        
        
        
    }
}