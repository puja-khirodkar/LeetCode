class Solution {
    public int minimumSwaps(int[] nums) {
        ArrayList<Integer> numsList = convertArrayToList(nums);
        int maxIndex = numsList.lastIndexOf(Collections.max(numsList));
        int minIndex = numsList.indexOf(Collections.min(numsList));

        if (nums.length == 1 || (minIndex == 0 && maxIndex == nums.length-1))
            return 0;
        else {
            int maxMoveCount = moveElement(numsList, maxIndex, numsList.size());
            minIndex = numsList.indexOf(Collections.min(numsList));
            int minMoveCount = moveElement(numsList, minIndex, 0);
            return maxMoveCount + minMoveCount;
        }
    }

    public int moveElement(List<Integer> numsList, int sourceIndex, int targetIndex) {
        int temp, count = 0;
        if (sourceIndex < targetIndex) {
            for (int i = sourceIndex; i < targetIndex-1; i++) {
                temp = numsList.get(i);
                numsList.set(i, numsList.get(i + 1));
                numsList.set(i + 1, temp);
                count++;
            }
        } else if (sourceIndex > targetIndex) {
            for (int j = sourceIndex; j > targetIndex; j--) {
                temp = numsList.get(j);
                numsList.set(j, numsList.get(j - 1));
                numsList.set(j - 1, temp);
                count++;
            }

        }
        return count;
    }

    public ArrayList<Integer> convertArrayToList(int[] nums) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int num : nums) {
            numList.add(num);
        }
        return numList;
    }
}
