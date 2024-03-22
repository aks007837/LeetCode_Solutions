import java.util.Stack;

public class palindromeLinkedList22032024 {
    class Listnode {
        int val;
        Listnode next = null;
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode p = head;
            int count = 0;
            while (p != null) {
                count++;
                p = p.next;
            }
            p = head;
            int c1 = 0;
            Stack<Integer> stk = new Stack<>();
            while (c1 != (count / 2)) {
                stk.push(p.val);
                c1++;
                p = p.next;
            }
            if (count % 2 != 0) {
                p = p.next;
            }
            while (c1 != 0) {
                if (p.val == stk.peek()) {
                    stk.pop();
                } else {
                    return false;
                }
                c1--;
                p = p.next;
            }
            return true;
        }
    }
}