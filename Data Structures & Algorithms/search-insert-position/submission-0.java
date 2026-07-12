class Solution {
    public int searchInsert(int[] nums, int target) {
        
        return bs(nums , target);
    }

    public int bs(int[] n , int t)
    {
        int l = 0 , r = n.length - 1 ;
        int m ;
        while(l<=r)
        {
            m = l +(r-l)/2;

            if(t == n[m])return m;
            else if(t<n[m]) r= m -1;
            else l = m+1;
        }

        return l;
    }
}