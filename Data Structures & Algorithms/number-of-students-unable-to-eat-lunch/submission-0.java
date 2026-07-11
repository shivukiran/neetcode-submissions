class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int n = students.length;
        Queue<Integer>q = new LinkedList<>();

        for(int student : students)
        {

            q.offer(student);
        }

        int r = n ;

        for(int sand : sandwiches)
        {
            int c = 0;
            while(c<n&&q.peek() != sand)
            {
                q.offer(q.poll());
                c++;
            }

            if(q.peek() == sand)
            {
                q.poll();
                r--;
            }
            else
            break;
        }
return r;


            }
}