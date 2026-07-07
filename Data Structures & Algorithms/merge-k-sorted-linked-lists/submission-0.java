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
    public ListNode mergeKLists(ListNode[] lists) {

            int size = lists.length;
            if(size == 0)return null;

            for(int i = 1 ; i < size ;i++)
            {

                lists[i] = merge(lists[i] , lists[i-1]);

            }
            return lists[size -1 ];
            }
    }

 private ListNode merge(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode tail;

        if(list1 == null )return list2;
        if(list2 == null)return list1;

        if(list1.val <= list2.val)
        {
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }

        tail = head;

        while(list1 != null && list2 != null)
        {

            if(list1.val <= list2.val)
            {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            else{
                 tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }

        }

        if(list1 != null)
        {
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }
        return head;
        
    }



