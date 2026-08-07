class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // If only one node
        if (count == 1) {
            return null;
        }

        int target = count - n + 1;

        // Remove head
        if (target == 1) {
            return head.next;
        }

        ListNode pre = null;
        ListNode cur = head;
        int pos = 1;

        while (cur != null) {
            if (pos == target) {
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
            pos++;
        }

        return head;
    }
}