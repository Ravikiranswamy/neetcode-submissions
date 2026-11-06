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
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;

    } 
    ListNode second = slow.next;
    slow.next = null;
    
    //reversing second one
    ListNode cur = second;
    ListNode nxt = null;
    ListNode prev = null;

    while(cur != null)
    {    
        nxt = cur.next;
        cur.next = prev;
        prev = cur;
        cur = nxt;
        
    }
   

    ListNode start = head;

    ListNode startnxt = start.next;
    ListNode temp= prev;
    

    while(temp != null)
    {
        start.next = temp;
        temp = temp.next;
        start = start.next;
        start.next = startnxt;
        startnxt = startnxt.next;
        start = start.next;
    }
   
    }
}
