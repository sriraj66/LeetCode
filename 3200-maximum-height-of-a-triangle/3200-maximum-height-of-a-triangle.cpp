class Solution {
public:
    int count_odd(int x) {
        int level = 0;
        int sum = 1, c = 1;
        while (sum <= x) {
            level++;
            c += 2;
            sum += c;
        }
        return level;
    }
    int count_even(int x) {
        int level = 0;
        int sum = 2, c = 2;
        while (sum <= x) {
            level++;
            c += 2;
            sum += c;
        }
        return level;
    }
    int maxHeightOfTriangle(int red, int blue) { 
        int olr = count_odd(red); //odd leve of red
        int elr = count_even(red);//eve lev of red
        
        int olb = count_odd(blue); //odd leve of blue
        int elb = count_even(blue);//eve lev of blue

        int h1=0,h2=0;
        if(olr>elb){
            h1 = 2*elb+1;
        }else if(olr <= elb){
            h1 = 2*olr;
        }
        if(olb>elr){
            h2 = 2*elr+1;
        }else if(olb<=elr){
            h2 = 2*olb;
        }
        return max(h1,h2);
    }
};