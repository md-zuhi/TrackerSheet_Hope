class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }
        int rsum=total,lsum=0;
        for(int i = 0;i < nums.length;i++){
            int curr = nums[i];
            rsum -= curr;
            if(lsum == rsum){
                return i;
            }
            else{
                lsum +=curr;
            }
        }
        return -1;
    }
}