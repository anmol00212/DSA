package LinkedList;
import java.util.*;
public class MergeKlist {

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)->a.val - b.val);
        for(ListNode it : lists){
            while(it!=null){
                pq.offer(it);
            }
        }
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(!pq.isEmpty()){
            ListNode newNode = pq.poll();
            temp.next = newNode;
            temp = temp.next;
            if(temp.next!=null){
                pq.offer(temp.next);
            }
        }
        return head.next;
    }
    private static void printLL(ListNode head){
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);

    }
}
