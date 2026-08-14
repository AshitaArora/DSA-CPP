class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int count=0;
        int n = s.length();
        int[] freq = new int[26];
        for(int j=0;j<n;j++){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            count=Math.max(count,j-i+1);

        }
        return count;
    }
}