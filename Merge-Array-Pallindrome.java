class MergeArrayIntoPalindrome {
    public int minimumOperations(int[] nums) {
        int i=0, j=nums.length-1;
        int lsum=nums[0], rsum=nums[j];
        int count=0;
            while(i<j){
                if(lsum>rsum){
                    j--;
                    rsum+=nums[j];
                    count++;
                }else if(lsum<rsum){
                    i++;
                    lsum+=nums[i];
                    count++;
                }else{
                    i++;
                    j--;
                    lsum=nums[i];
                    rsum=nums[j];
                }
            }
        return count;
    }
}
