/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int cnt1 = getListLength(headA);
        int cnt2 = getListLength(headB);
        
        if(cnt1 > cnt2) {
            headA = get(headA, cnt1 - cnt2);
        }else if(cnt1 < cnt2) {
            headB = get(headB, cnt2 - cnt1);
        }
        
        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    
    public int getListLength(ListNode node) {
        int length = 0;
        while(node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
    
    
    public ListNode get(ListNode head, int n) {
        int cnt = 0;
        ListNode node = head;
        while(node.next != null) {
            if(cnt == n) break;
            else {
                cnt++;
                node = node.next;
            }
        }
        return node;
    }
}