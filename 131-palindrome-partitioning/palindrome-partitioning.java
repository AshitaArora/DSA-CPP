class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        backtrack(s,0,ds,ans);         
        return ans;
    }
    private void backtrack(String s,int index,List<String> ds,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(palindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                backtrack(s,i+1,ds,ans);
                ds.remove(ds.size()-1);

            }

        }
    }
    boolean palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){return false;}
            left++;
            right--;
        }
        return true;
    }
}