class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int lb= 0;
        int hb = matrix.size()-1;
        int left = 0;
        int right = matrix[0].size()-1;
        int dir = 0;
        vector<int> ans;

        while(lb<=hb && left <= right){
            if(dir == 0){
                for(int i=left;i<=right;i++){
                    ans.push_back(matrix[lb][i]);
                }
                lb++;
            }
            else if(dir == 1){
                for(int i= lb; i<= hb ; i++){
                    ans.push_back(matrix[i][right]);
                }
                right --;

            }else if(dir == 2){
                for(int i = right;i>=left;i--){
                    ans.push_back(matrix[hb][i]);
                }
                hb--;
            }
            else if(dir == 3){
                for(int i = hb;i>=lb;i--){
                    ans.push_back(matrix[i][left]);
                }
                left ++;
            }

           if(dir==4){
            dir = 0;
           }else{
            dir++;
           }

        }
        return ans;

    }
};