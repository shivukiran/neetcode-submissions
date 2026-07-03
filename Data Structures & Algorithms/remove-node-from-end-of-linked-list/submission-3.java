/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode temp = new ListNode(0);
            temp.next = head;

            ListNode slow = temp;
            ListNode fast = temp;

        //move fast to n+1
            for(int i = 0 ; i<=n ; i++)
            {
                fast = fast.next;
            }


        //get slow before n 
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        // now point to slow to next of next

        slow.next = slow.next.next;

        return temp.next;

    }
}
