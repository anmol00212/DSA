package LinkedList;

public class mergetwo {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode ans = new ListNode(-1);
        ListNode head = ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                ans.next = l1;
                l1 = l1.next;
            }
            else{
                ans.next = l2;
                l2 = l2.next;
            }
            ans = ans.next;
        }
        if(l1!=null){
            ans.next = l1;
            //l1 = l1.next;
        }
        if(l2!=null){
            ans.next = l2;
            //l2 = l2.next;
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
        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(3);
        //list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(7);
        //list2.next.next = new ListNode(4);
        printLL(list1);
        printLL(list2);
        ListNode temp = mergeTwoLists(list1,list2);
        printLL(temp);
    }
}
