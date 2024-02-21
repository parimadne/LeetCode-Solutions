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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next=null;
        
        ListNode prev = null;
        
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
          
        }

        
        while(prev!=null&&head!=null){
            if(prev.val!=head.val){
                return false;
            }
            prev=prev.next;
           head=head.next;
        }
        return true;
    }
}