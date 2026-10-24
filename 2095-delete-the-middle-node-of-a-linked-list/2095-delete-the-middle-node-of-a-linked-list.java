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
    public ListNode deleteMiddle(ListNode head) {
    if(head==null||head.next==null)
    {
        return null;
    }
    ListNode temp=head;
    int c=0;
    while(temp!=null)
    {
        c++;
        temp=temp.next;
    }
    int mid=c/2;
    ListNode slow = head;
    for(int i=0;i<mid-1;i++)
    {
        slow=slow.next;
    }
    slow.next=slow.next.next;
    return head;    
    }
}