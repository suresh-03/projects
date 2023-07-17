import list.linkedlist;
import list.linkedlist.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.InsertLast(1);
        l.InsertLast(2);
        l.InsertLast(3);
        l.InsertLast(4);
        l.InsertLast(5);
        l.InsertLast(6);
        

        reverseList(l.head);
        l.display();
    }
      public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode t = head.next;
        ListNode t1 = head;
        head.next = null;
        while(t != null){
            head = t;
            t = head.next;
            head.next = t1;
            t1 = head;
        }
        return head;
    }
}
