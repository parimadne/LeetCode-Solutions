/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
    ListNode temp = head;
    ListNode temp1 = new ListNode(0);
    ListNode temp2 = new ListNode(0);
    ListNode pre1 = temp1;
    ListNode pre2 = temp2;
      while (temp != null) {
       if (temp.val < x) {
         pre1.next = temp;
            pre1 = temp;
        } else{
         pre2.next = temp;
            pre2 = temp;
        } 
         temp = temp.next;
      }
      pre2.next = null;
       pre1.next = temp2.next;
       return temp1.next;
    }
}