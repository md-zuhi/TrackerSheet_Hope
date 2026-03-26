class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if (len<=1) return; 
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    public int[] reverse(int[] n, int start, int end){
        while(start<end){
            int temp  = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
        return n;
    }
}