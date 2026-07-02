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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        
        ListNode dummy(-1);
        ListNode*temp = &dummy;

        ListNode* l = list1;
        ListNode* r = list2;

        while(l != NULL && r!= NULL){

            if(l->val < r->val)
            {
                temp->next = l;
                l = l->next;
                temp = temp->next;
            }
            else
            {
                temp->next = r;
                r = r->next;
                temp = temp->next;
            }
        }

        if(l != NULL)
        {
                temp->next = l;
          
        }
        else
        {
             temp->next = r;
              
        }
    return dummy.next;
    }
};
