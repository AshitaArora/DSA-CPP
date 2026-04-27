class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");
        int a = arr.length;
        return arr[a-1].length();
    }
}