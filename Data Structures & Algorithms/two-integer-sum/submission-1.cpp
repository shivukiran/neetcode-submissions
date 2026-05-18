class Solution {

    unordered_map< int , int > check ;
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        for(int i = 0 ; i < nums.size() ; i++)
        {
            int diff = target - nums[i];

            if(check.find(diff) != check.end())
            {
                int val = check[diff];
                // int arr = 
                vector<int> arr = {val , i};
                return arr;
            }
            
                check[nums[i]]=i;
            
        }
        return {};
    }
};
