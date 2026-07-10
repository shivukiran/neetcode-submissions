class Solution {
    public int[] countBits(int n) {

     int []res = new int[n+1];

     while( n>=1)
     {  
        int num = n;
        int count = 0 ;
          while(num != 0)
        {
            count += num % 2 ;
            num = num >> 1;
        }

        res[n] = count;
        n--;

     }   
     return res;
    }
}
