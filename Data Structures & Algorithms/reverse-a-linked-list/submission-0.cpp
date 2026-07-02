/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        

        if(!head)return 0 ;
        if(head->next == NULL)return head;

        ListNode*p = NULL;
        ListNode*c = head;


        while(c != NULL)
        {
            ListNode* next = c->next;
            c->next = p;
            p = c;
            c = next ;

        }
            head = p;
        return head;
    }
};
