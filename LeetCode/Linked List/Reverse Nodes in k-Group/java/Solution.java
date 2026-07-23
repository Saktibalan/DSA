class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findKthNode(ListNode node, int k) {
        while (node != null && k > 1) {
            node = node.next;
            k--;
        }
        return node;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prevLast = null;
        while (temp != null) {
            ListNode kth = findKthNode(temp, k);
            if (kth == null) {
                if (prevLast != null) prevLast.next = temp;
                break;
            }
            ListNode nextNode = kth.next;
            kth.next = null;
            ListNode reversedHead = reverse(temp);
            if (temp == head) head = reversedHead;
            else prevLast.next = reversedHead;
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
}
