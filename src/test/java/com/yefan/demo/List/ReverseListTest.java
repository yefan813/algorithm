package com.yefan.demo.List;

import com.yefan.demo.ListNode;
import org.junit.Before;
import org.junit.Test;


public class ReverseListTest {


    ListNode head;


    @Before
    public void setup() {
        head = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        ListNode listNode4 = new ListNode();
        ListNode listNode5 = new ListNode();
        head.setData("a");
        head.setNext(listNode2);

        listNode2.setData("b");
        listNode2.setNext(listNode3);

        listNode3.setData("a");
        listNode3.setNext(listNode4);

        listNode4.setData("bvv");
        listNode4.setNext(listNode5);

        listNode5.setData("cc");
        listNode5.setNext(null);

    }

    @Test
    public void testReverseList() {
        // Setup

        // Run the test
        ListNode node = ReverseList.reverseList(head);

        while (node != null) {
            System.out.println(node.getData());
            node = node.next;
        }

    }
}
