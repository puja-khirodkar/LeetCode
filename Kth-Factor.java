class Solution {
    public int kthFactor(int n, int k) {
        int count=1, result = 1;
        if(k==1)
            return 1;
        for(int i=2; i<=n; i++){
            if(n%i==0 && count!=k){
                count++;
                result = i;
            }
        }
        if(count<k)
            return -1;
        return result;
    }
}
