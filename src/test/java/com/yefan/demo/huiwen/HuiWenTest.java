package com.yefan.demo.huiwen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class HuiWenTest {
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

        listNode4.setData("b");
        listNode4.setNext(listNode5);

        listNode5.setData("a");
        listNode5.setNext(null);

    }

    @Test
    public void testIsPalindrome() {

        // Run the test
        final boolean result = HuiWen.isPalindrome(head);

        // Verify the results
        Assert.assertTrue(result);
    }

    @Test
    public void test2IsPalindrome() {

        // Run the test
        final boolean result = HuiWen2.isPalindrome(head);

        // Verify the results
        Assert.assertTrue(result);
    }

    @Test
    public void test3IsPalindrome() {

        // Run the test
        final boolean result = HuiWen3.isPalindrome(head);

        // Verify the results
        Assert.assertTrue(result);
    }

}
