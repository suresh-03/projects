
public class ReverseLinkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(3);
        list.InsertLast(4);
        list.InsertLast(5);
        list.InsertLast(10);
        list.InsertLast(20);
        list.InsertLast(30);
        list.InsertLast(40);
        list.InsertLast(50);

        list.display();
        list.Reverse();
        list.display();
        System.out.println(list.head.data);

    }

}
