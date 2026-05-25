class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0 )
        {
            return 0;
        }

        int count = 1 ;
        int maxi = 1;
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length -1 ;i++)
        {
            if(nums[i+1]== nums[i] + 1){
                count++;
            }
            else if(nums[i + 1] == nums[i])
            {
                continue;
            }
            else
            {
                maxi = Math.max(maxi , count);
            
                //reset count to 1 
                count = 1;
            }
        }
        return Math.max(maxi , count);
    }
}
