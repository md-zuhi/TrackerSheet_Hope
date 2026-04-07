class Solution {
    public int maxArea(int[] height) {
        int front = 0,end = height.length-1;
        int maxheight = 0,maxwater=0,min = 0,top=0;
        while(front<end){
            if(height[front]<height[end]){
                min = height[front];
                maxwater = min * (end-front);
                front++;
            }
            else{
                min = height[end];
                maxwater = min * (end-front);
                end--;
            }
            top = Math.max(top,maxwater);
        }
        return top;
    }
}