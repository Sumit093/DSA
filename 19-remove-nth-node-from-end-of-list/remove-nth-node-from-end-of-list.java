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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        if (n == 1){
            head = head.next;
        return reverse(head);
        }
    
        ListNode temp = head; 
        for(int i=0;i<n-2;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        head = reverse(head);
        return head;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp!= null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}