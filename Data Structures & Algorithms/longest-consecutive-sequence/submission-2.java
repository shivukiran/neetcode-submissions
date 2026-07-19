class Solution {
    public int longestConsecutive(int[] nums) {

        
        Set<Integer>set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        int maxi = 0 ;
        for(int n : set){

            if(!set.contains(n - 1)){
                int count = 1;

                    while(set.contains( n + count)) count++;

        maxi = Math.max(maxi , count);
            }

        

        }

        return maxi;
    }
}
