class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split the list
        ListNode second = slow.next;
        slow.next = null;

        // Step 3: Reverse second half
        ListNode cur = second;
        ListNode prev = null;

        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }

        // Step 4: Merge both halves
        ListNode first = head;
        ListNode secondHalf = prev;

        while (secondHalf != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = secondHalf.next;

            first.next = secondHalf;
            secondHalf.next = firstNext;

            first = firstNext;
            secondHalf = secondNext;
        }
    }
}