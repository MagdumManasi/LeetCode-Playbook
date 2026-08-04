class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int index = nums.length - 1;

        int[] c = new int[nums.length];

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                c[index] = nums[i] * nums[i];
                i++;
            } else {
                c[index] = nums[j] * nums[j];
                j--;
            }
            index--;
        }

        return c;
    }
}