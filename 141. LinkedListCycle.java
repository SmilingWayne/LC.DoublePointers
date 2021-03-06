/*Given head, the head of a linked list, determine if the linked list has a cycle in it.
Java.Version:
*/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head==null)
        return false;
        while(fast!=null&&fast.next!=null)。 //fast判断放在前面，接下来才是fast.next判断//
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            return true;
        }
        return false;
    }
}
