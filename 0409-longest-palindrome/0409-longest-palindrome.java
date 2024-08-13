class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[256];
        for(var c : s.toCharArray()){
            freq[c]++;
        }
        int palinLen = 0;
        boolean oddFreqExist = false;
        for(var fr : freq){
            if(fr % 2 != 0){
               oddFreqExist = true;
            }
            palinLen += (fr / 2);
        }
        return (palinLen * 2 + ((oddFreqExist) ? 1 : 0));
    }
}