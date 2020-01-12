class Solution {
    public List<Integer> countSmaller(int[] nums) {
        final int N = nums.length;
        List<Integer> smallerCounts = new ArrayList<Integer>();
        for (int i = 0; i< N; i++) {
            int smallerCount = 0;
            for (int j = i+1; j< N; j++) {
                if (nums[i] > nums[j]) {
                    smallerCount++;
                }
            }
            smallerCounts.add(smallerCount);
        }
        return smallerCounts;
    }
}
