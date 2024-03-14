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
    public ListNode deleteDuplicates(ListNode head) {
       if(head== null || head.next== null){
           return head;
       }
       ListNode newHead = null;
       ListNode tail = null;
       int value = Integer.MIN_VALUE;
       ListNode temp = head;

       while(temp!= null){
           if(temp.next != null && temp.val == temp.next.val){
               value = temp.val;
               temp = temp.next;
               continue;
           }
           if(temp.val!= value){
               if(newHead == null){ 
               newHead = temp;
               tail = temp;
           }else{
               tail.next = temp;
               tail = temp;
           }
       }
       temp = temp.next;
       }
       if(tail!= null){
           tail.next = null;
       }
       return newHead;
    }
}