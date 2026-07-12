class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l = bs(nums , target , true);
        int r = bs(nums , target , false);

        return new int[] {l,r};
    }

    public int bs(int[] nums, int target,boolean bias) {

        int l = 0 , r = nums.length -1 , i = -1;
        while(l<=r)
        {
            int mid = l +(r-l)/2;

            if(target>nums[mid])
            {
                l = mid +1;
            }
            else if(target<nums[mid])
            {
                r = mid-1;
            }
            else{
                i = mid;
                if(bias)r = mid -1;
                else l = mid +1;
            }

        }
        return i;
    }
}