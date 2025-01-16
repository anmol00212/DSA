package LinkedList;

public class ReorderLL {
    private static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle is "+slow.val);
        return slow;
    }
    private static ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode mid = middle(temp);
        ListNode list2 = mid.next;
        mid.next = null;
        list2 = reverse(list2);
        printLL(list2);
        ListNode ans = new ListNode(-1);
        int i=0;
        while(temp!=null || list2!=null){
            if(i%2==0){
                ans.next = temp;
                temp = temp.next;
            }
            else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
            i++;
        }

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
        head.next = new ListNode(2);
        //head.next.next = new ListNode(3);
        //head.next.next.next = new ListNode(4);
        //head.next.next.next.next=new ListNode(5);
        printLL(head);
        ListNode mid = middle(head);
        reorderList(head);
        printLL(head);
    }
}
