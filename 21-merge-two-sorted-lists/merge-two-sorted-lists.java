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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = null;
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode t3 = null;

        if(list1 != null && list2 != null){
            if(list1.val<list2.val){
                merged = list1;
                t3 = merged;
                t1 = t1.next;
                t3.next = null; 
            }
            else{
                merged = list2;
                t3 = merged;
                t2 = t2.next;
                t3.next = null; 
            }
        }
        else{
            if(list1==null) return list2;
            if(list2==null) return list1;
        }

        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t3.next = t1;
                t1 = t1.next;
            }
            else{
                t3.next = t2;
                t2 = t2.next;
            }
            t3 = t3.next;
        }
        if(t1==null) t3.next = t2;
        if(t2==null) t3.next = t1;

        return merged;
    }
}