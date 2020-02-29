package com.yefan.demo.huiwen;

import java.util.ArrayList;
import java.util.List;


/**
 * 时间复杂度O(n)
 *
 * 空间复杂度O(n)  --ArrayList
 */
public class HuiWen {

    public static boolean isPalindrome(ListNode head) {
        List<String> vals = new ArrayList<String>();

        ListNode currentNode = head;
        while(currentNode != null) {
            vals.add(currentNode.data);
            currentNode = currentNode.next;
        }

        boolean result = true;
        Integer front = 0;
        Integer back = vals.size()-1;
        for (int i = 0; i < vals.size(); i++) {
            if(!vals.get(front).equals(vals.get(back))){
                result = false;
                break;
            }
            front++;
            back--;
        }
        return result;
    }

}
