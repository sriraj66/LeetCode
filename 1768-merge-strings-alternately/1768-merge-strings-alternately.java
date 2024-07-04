import java.lang.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        if(word1.length()<=1) return word1+word2;

        int s1 = 0,s2=0,f=0;
        boolean is_done = true;

        while(is_done){
            int l1 = word1.length();
            int l2 = word2.length();
            if(f==0 && s1<l1){
                res.append(word1.charAt(s1));
                s1++;
                f=1;
            }
            else if(f==1 && s2<l2){
                res.append(word2.charAt(s2));
                s2++;
                f = 0;
            }else{

                if(s1>=l1 && s2<l2){
                    for(int i=s2;i<l2;i++){
                        res.append(word2.charAt(i));
                        // s2++;
                    }
                
                }
                if(s2>=l2 && s1<l1){
                
                    for(int i=s1;i<l1;i++){
                        res.append(word1.charAt(i));
                        // s1++;
                    }
                    
                }

                is_done = false;
            }
        }

        return res.toString();
    }
}