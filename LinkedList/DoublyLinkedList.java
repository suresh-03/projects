public class DoublyLinkedList {
    Node head;
    int size = 0;
    Node tail;

    public class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    // --------------------------------------------------------------------------

    public void InsertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        tail = node;
        size++;
    }

    // ----------------------------------------------------------------------------
    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in Reverse:");
        while (last != head) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.print(last.data + " -> ");
        System.out.println("END");
        System.out.println(size);
    }
    // ---------------------------------------------------------------------------

    public void InsertLast(int data) {
        if (tail == null) {
            InsertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    // --------------------------------------------------------------------------

    public void Insert(int data, int pos) {
        if (head == null) {
            InsertFirst(data);
            return;
        }
        if (tail == null) {
            InsertLast(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp, temp.next);
        temp.next.prev = node;
        temp.next = node;
        size++;
    }
    // --------------------------------------------------------------------------

    public void DeleteFirst() {
        if (head != null) {
            head = head.next;
        }
        System.out.println("DELETED NODE: " + head.prev.data);
        size--;
    }

    // --------------------------------------------------------------------------

    public void DeleteLast() {
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        System.out.println("DELETED NODE: " + tail.next.data);
        tail.next = null;
        size--;
    }

    // --------------------------------------------------------------------------

    public void Delete(int pos) {
        if (pos == 1) {
            DeleteFirst();
            return;
        }
        if (pos == size) {
            DeleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        System.out.println("DELETED NODE: " + temp.next.data);
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    // --------------------------------------------------------------------------

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.InsertLast(10);
        list.InsertLast(20);
        list.InsertLast(30);
        list.InsertLast(40);
        list.Insert(25, 3);
        list.Insert(15, 2);
        list.Insert(35, 6);
        list.DeleteFirst();
        list.DeleteFirst();
        list.DeleteLast();
        list.DeleteLast();

        list.display();
        list.Delete(2);
        list.display();
        list.Delete(1);
        list.display();

    }
}
