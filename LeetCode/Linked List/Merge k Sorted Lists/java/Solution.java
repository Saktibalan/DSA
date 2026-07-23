class Solution {
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        while (lists.length > 1) {
            int mergedSize = (lists.length + 1) / 2;
            ListNode[] merged = new ListNode[mergedSize];
            for (int i = 0; i < mergedSize; i++) {
                int index1 = i * 2;
                int index2 = i * 2 + 1;
                ListNode l1 = lists[index1];
                ListNode l2 = (index2 < lists.length) ? lists[index2] : null;
                merged[i] = mergeTwoLists(l1, l2);
            }
            lists = merged;
        }
        return lists[0];
    }
}
