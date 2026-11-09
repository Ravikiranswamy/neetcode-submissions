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
        int count = 0;
    ListNode cur = head;
    ListNode nextnode = null;
    ListNode prev = null;

    while(cur != null)
    {
        nextnode = cur.next;
        cur.next = prev;
        prev = cur;
        cur = nextnode;
     }
     ListNode tail = prev;
     ListNode temp = prev;

     nextnode = null;
     prev = null;

     while(temp != null)
{    count++;
     nextnode = temp.next;
     if(n == 1)
     {
        tail = tail.next;
        temp.next = null;
        break;
     }
     if(count == n && n != 1)
    {
      prev.next = nextnode;
      break;
    }
    prev = temp;
    temp = nextnode;
}
  cur = null;
  prev = null;
  nextnode = null;
  cur = tail;

  while(cur != null)
  {
    nextnode = cur.next;
    cur.next = prev;
    prev = cur;
    cur = nextnode;
  }
  return prev;
  


  }
}
