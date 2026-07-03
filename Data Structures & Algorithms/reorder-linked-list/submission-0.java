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
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) { return; }
        
        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }


        ListNode cur = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(cur != null ){
            ListNode nextNode = cur.next ;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }

        ListNode l1 = head;

            ListNode l2 = prev;    
            ListNode temp = new ListNode(0);
    ListNode temp2 = new ListNode(0);
        while( l1 != null && l2!= null)
        {
            temp = l1.next;
            l1.next = l2;
            temp2 = l2.next;
            l1 = temp;
            l2.next = l1;
            l2 = temp2;
        }



    }
}
