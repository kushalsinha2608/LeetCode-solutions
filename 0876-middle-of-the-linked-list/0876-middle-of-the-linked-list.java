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
    public ListNode middleNode(ListNode head) {
    if(head==null||head.next==null)
    {
        return head;
    }
    ListNode temp=head;
    int c=0;
    while(temp!=null)
    {
        c++;
        temp=temp.next;
    }
    ListNode b=head;
    int d=0;
    while(b!=null)
    {
        d++;
        if(d==(c/2)+1)
        {
            return b;
        }
        b=b.next;
    }
    return head;    
    }
}