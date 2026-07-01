class Solution {
public:
    int search(vector<int>& nums, int target) {
        

        int l = 0 ;
        int r = nums.size() -1;

        while(l < r)
        {
            int mid = l + (r - l ) /2 ;

            if(nums[mid] > nums[r])
            {
                l = mid + 1 ;
            }
            else
            {
                r = mid;
            }
        }

        int pivot = l;


        int ans = bs(nums , target , 0 , pivot - 1);

        if(ans != -1)
        {
            return ans;
        }

        return bs(nums , target , pivot , nums.size()- 1);
    }
        int bs(vector<int>&nums , int t , int l , int r)
        {

            while(l <= r){
            int mid = (l + r) / 2 ;

            if(nums[mid] == t)
            return mid;
            else if(nums[mid] < t)
            {
                l = mid + 1;
            }
            else{

                r = mid - 1;
            }

            }

            return -1;
        }


    
};
