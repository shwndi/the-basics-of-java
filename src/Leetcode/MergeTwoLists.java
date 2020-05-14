package Leetcode;
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        for (int i = 0; i < 3; i++) {
            System.out.println(l1.val);
            l1=l1.next;

        }
//        System.out.println(l1.val);
//        System.out.println(l1.next.val);
//        System.out.println(l1.next.next.val);
//        ListNode result = mergeTwoLists(l1,l2);
//        System.out.println(result.val);
//        System.out.println(result.next.val);
//        System.out.println(result.next.next.val);
    }
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode tmp = new ListNode(0);
        ListNode res = tmp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;

            }
            tmp = tmp.next;
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return res.next;
    }

}

