package com.penghk.learn;

import java.util.Objects;

/**
 * @Author:hangkong.peng
 * @Date: 2021/6/18 11:36
 */
public class AddTwoNumbers02 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode current = new ListNode();
        ListNode result = current;
        int p = 0;

        do {
            int val1 = Objects.isNull(l1) ? 0 : l1.val;
            int val2 = Objects.isNull(l2) ? 0 : l2.val;

            current.val = (val1 + val2 + p) % 10;
            p = (val1 + val2 + p) / 10;

            ListNode pre = current;
            pre.next = new ListNode();
            current = current.next;

            l1 = Objects.isNull(l1) ? null : l1.next;
            l2 = Objects.isNull(l2) ? null : l2.next;

            if (Objects.isNull(l1) && Objects.isNull(l2) && p == 0) {
                pre.next = null;
            }

        } while (Objects.nonNull(l1) || Objects.nonNull(l2) || p != 0);

        return result;
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode result = addTwoNumbers(l1, l2);
        while (Objects.nonNull(result)) {
            System.out.println(result.val + " ");
            result = result.next;
        }

    }


}
