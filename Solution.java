class Solution {
    public int findPeakElement(int[] nums) {
        int index = 0;
        for( int i=0 ; i<nums.length ; i++){
            if( nums[i] > nums[index] ){
                index = i;
            }
        }
        return index;
    }
}