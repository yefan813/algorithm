package com.yefan.demo.huiwen;


import com.yefan.demo.ListNode;

/**
 * 时间复杂度O(n)
 *
 * 空间复杂度O(1) -- 在原始链表上做反转
 */
public class HuiWen3 {

    public static boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        ListNode firstHalfEnd = firstEndList(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while(p2 != null){
            if(!p1.getData().equals(p2.getData())){
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        firstHalfEnd.next = reverseList(secondHalfStart);
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
       return result;
    }

    public static ListNode firstEndList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currentNode = head;
        while(currentNode != null) {
            ListNode nextTmp = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextTmp;
        }
        return preNode;
    }

}
