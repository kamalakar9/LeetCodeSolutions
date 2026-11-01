class Solution {
    public int minMoves(int[] nums) {
        int minElement = nums[0];
        for(int num : nums){
            if(num < minElement){
                minElement = num;
            }
        }
        int minMoves = 0;
        for(int i=0; i<nums.length; i++){
            minMoves = minMoves + (nums[i] - minElement);
        }
        return minMoves;
    }
}