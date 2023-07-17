public class CircularLinkedList {

    Node head;
    Node tail;
    int size = 0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // ------------------------------------------------------------------------------
    public void InsertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
        size++;
    }
    // ----------------------------------------------------------------------------

    public void InsertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {

            node.next = head;
            head = node;
            tail.next = head;

        }
        size++;
    }

    // ----------------------------------------------------------------------------
    public void display() {
        Node temp = head;
        for (int i = 0; i < size + 1; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("etc..");
        System.out.println(size);
    }

    // -------------------------------------------------------------------------------
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);

        list.display();

    }
}
