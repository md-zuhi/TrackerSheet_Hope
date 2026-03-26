class Solution {
    public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                count++;
            }
        }
        if(count==0) return true;
        if(count==arr.length) return true;
        if(count==1 && Character.isUpperCase(arr[0])) return true;
        return false;
    }
}