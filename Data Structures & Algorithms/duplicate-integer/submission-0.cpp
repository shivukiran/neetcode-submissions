class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {

      unordered_map< int , int > count;

    // int count[nums.size()];

      for(int i = 0 ; i < nums.size(); i++ )
      {
        if(count[nums[i]] == 0  )
        {
            count[nums[i]] = 1;
        }
        else{
            return true;
        }
      }

      return false;  

    }
};