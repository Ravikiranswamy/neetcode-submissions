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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftmost = null;
        ListNode rightmost = null;

        ListNode temp = head;
          int count = 1;
        while(temp != null)
        {
        
          
          if(count == left-1)
          {
            leftmost = temp;
          }
          if(count == right + 1)
          {
            rightmost = temp;
            break;
          }
          temp = temp.next;
          count++;
        }

         ListNode cur = null;
         if(leftmost == null)
         {
             cur = head;
         }
         else
         {
         cur = leftmost.next;
         }

        ListNode nextlink = null;
        ListNode prev = rightmost;
        while(cur != rightmost)
        {
          nextlink = cur.next;
          cur.next = prev;
          prev = cur;
          cur = nextlink;
        }
        if(leftmost == null)
         {
            return prev;
          }
        else
        {
        leftmost.next = prev;
            return head;
        }
    }
}