class Solution {
    public int[] sortArray(int[] nums) {
        

         mS(nums , 0 , nums.length -1);

         return nums;
    }

    void merge(int[] nums , int low , int mid ,int high)
    {
        int left = low ;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList();

        while(left<= mid && right <= high)
        {
            if(nums[left] <= nums[right])
            {
                    temp.add(nums[left]);
                    left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }


        while(left<=mid)
        {
            temp.add(nums[left]);
            left++;
        }

          while(right<=high)
        {
            temp.add(nums[right]);
            right++;
        }


           for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

    }
    void mS(int[] nums , int low , int high)
    {

        if(low >= high)return ;

        int mid = low + (high - low)/2;

        mS(nums , low , mid);
        mS(nums , mid + 1 , high);


        merge(nums , low , mid , high);

    }
}