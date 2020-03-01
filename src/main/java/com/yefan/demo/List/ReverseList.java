package com.yefan.demo.List;

import com.yefan.demo.ListNode;

/**
 * 链表反转
 * @author yefan
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        return prev;
    }

}
