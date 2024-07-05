class Solution {
    public int maxHeightOfTriangle(int red1, int blue1) {
        if(red1==1 && blue1 == 1){
            return 1;
        }
        if(red1==1 || blue1==1){
            return 2;
        }
        int max = 0;
        for(int i=0;i<=1;i++){
            int height = 0;
            int blue = blue1;
            int red = red1;
            int f = i;
            boolean can_grow = true;
            while(can_grow){
                if(f==0 && blue>0 && (blue>=height+1)){
                    height++;
                    blue-=height;
                    f=1;
                    System.out.println("blue");
                }
                else if(f==1 && red>0 && (red>=height+1)){
                    height++;
                    red-=height;
                    f=0;
                    System.out.println("red");
                
                }else{
                    can_grow=false;
                }

            }
            System.out.println(height);
            if(max<height){
                max = height;
            }
        }
        return max;
    }
}