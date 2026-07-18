class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        for(j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                i = Math.max(i,map.get(ch)+1);
            }
            map.put(ch,j);
            ans = Math.max(ans,j-i+1);
        }
        return ans; 
    }
}