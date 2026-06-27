class Solution {
public:
    int maxArea(vector<int>& nums) {
        

        int i , j ;
        int size = nums.size();
        i = 0 ;
        j = size - 1;
        int ans = 0 ;
        while( i < j )
        {

            

            int min_h = min(nums[i] , nums[j]);
            int len = j - i ;

            if(nums[i] > nums[j])j--;
            else i++;
           int  vol = min_h * len ;

            ans = max(ans , vol);

        }

        return ans;
    }
};
