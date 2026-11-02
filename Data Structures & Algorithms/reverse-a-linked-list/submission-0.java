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
    public ListNode reverseList(ListNode head) {
       if(head == null)
       {
        return null;
       } 

       ListNode temp = head;
       ListNode nextnode = temp.next;
       ListNode prevnode = null;

       while(temp != null)
       {nextnode = temp.next;
        temp.next = prevnode;
        prevnode = temp;
        temp = nextnode;
        
        }
       return prevnode;
    }
}
