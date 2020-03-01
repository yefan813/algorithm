package com.yefan.demo.huiwen;

import com.yefan.demo.ListNode;

/**
 * 时间复杂度O(n)
 *
 * 空间复杂度O(n) --递归调用 堆栈分配
 */
public class HuiWen2 {
    private static ListNode frontPointer;

    public static boolean recursivelyCheck(ListNode currentNode) {
        if (null != currentNode) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (!frontPointer.getData().equals(currentNode.getData())) {
                return false;
            }
            frontPointer = frontPointer.next;
        }

        return true;
    }


    public static boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }
}
