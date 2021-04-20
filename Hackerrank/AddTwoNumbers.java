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
//https://leetcode.com/problems/add-two-numbers
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return rvsrNode(l1, l2, false);
    }
    
    ListNode rvsrNode(ListNode l1, ListNode l2, boolean carry){
        if (l1== null && l2 == null && carry){
            return new ListNode(1);
        }
        if(l1 ==null && l2 ==null){
            return null;
        }
        boolean c= false;
        int v1 = (l1==null) ? 0: l1.val;
        int v2= (l2 == null) ? 0:l2.val;
        int sum= v1+v2;
        
        if (carry) {sum ++;}
        
        if(sum >=10) {
            sum= sum -10;
            c=true;
        }
        ListNode res = new ListNode(sum);
        
      if(l1 != null && l2 != null){
          res.next =rvsrNode(l1.next, l2.next, c);
      }  
      if(l1 == null && l2 != null){
          res.next = rvsrNode(null, l2.next, c);
      } 
        if(l1 != null && l2 == null){
            res.next= rvsrNode(l1.next, null, c);
        }
        return res;
    }
}
