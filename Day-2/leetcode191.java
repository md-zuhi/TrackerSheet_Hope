class Solution {
    public int hammingWeight(int n) {
        String bin= Integer.toBinaryString(n);
        char[] arr = bin.toCharArray();
        int count=0;
        for(int i=0;i<bin.length();i++){
            if(arr[i]=='1'){
                count++;
            }
        }
        return count;
    }
}