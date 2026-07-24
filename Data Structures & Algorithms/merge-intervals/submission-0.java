class Solution {
    public int[][] merge(int[][] intervals) {


        Arrays.sort(intervals , (a,b)->Integer.compare(a[0] , b[0]));

        ArrayList<int[]> list = new ArrayList<>();

        list.add(intervals[0]);

        for(int i = 1 ; i < intervals.length ;i++)
        {

            int[] output = list.get(list.size() - 1);
            if(output[1] >= intervals[i][0]){

                output[1] = Math.max(output[1] , intervals[i][1]);

            }
            else{
                list.add(intervals[i]);
            }
        }

    return list.toArray(new int[list.size()][]);


    }
}