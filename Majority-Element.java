class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max=0, val=0, maxVal=nums[0];
        for(int i=0; i< nums.length; i++){
            if(map.get(nums[i])!=null){
                val = map.get(nums[i]);
                map.put(nums[i],++val);
                if(max<val){
                    max=val;
                    maxVal = nums[i];
                }
            }else{
                map.put(nums[i],1);
            }

        }
        return maxVal;
    }
}
