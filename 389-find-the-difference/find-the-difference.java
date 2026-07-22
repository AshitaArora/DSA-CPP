class Solution {
    public char findTheDifference(String s, String t) {
        // char result=0;
        // for(int i=0;i<s.length();i++){
        //     result^=s.charAt(i);
        // }
        // for(int i=0;i<t.length();i++){
        //     result^=t.charAt(i);
        // }
        // return result;

        //2nd method by frequency array
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        
        if(freq[t.charAt(i)-'a']<0){
            return t.charAt(i);
        }}
        return ' ';
    }
}
//used property of xor same characters 0 hogye jo bch gya 1 hua nd return hogya result me