import java.util.ArrayList;
class Solution {
    public int lastRemaining(int n) {
        if (n==1) return 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
                list.add(i);
        }
        boolean passed = true;
        while(list.size()>1){
            ArrayList<Integer> last = new ArrayList<>();
            if (passed){
                for(int i=1;i<list.size();i+=2){
                    last.add(list.get(i));
                }
            }
            else{
                int start = (list.size() % 2 == 0) ? 0 : 1;
                for(int i=start;i < list.size();i+=2){
                    last.add(list.get(i));
                }
            }
            passed = !passed;
            list = last;
        }
        
        return list.get(0);
    }
}