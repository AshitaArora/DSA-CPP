class Solution {
    public int countAsterisks(String s) {
        boolean inside = false;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='|')inside = !inside;
            else if(ch=='*'&& !inside)count++;
        }
        return count;
    }
}
//we did !inside cuz the value should toggle between pipes depending on their values if we say inside = true to ek bar agar true hogya to uske piche k sare * count krega ye