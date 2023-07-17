

class LinkedList {

    public Node head;
    public Node tail;
    public int size = 0;

    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // inserting the element in the list in first position

    public void InsertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // -----------------------------------------------------------------------------

    public void InsertLast(int data) {
        if (tail == null) {
            InsertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;

    }

    // --------------------------------------------------------------------------

    // insert in the given index
    public void insert(int data, int index) {
        if (index == 0) {
            InsertFirst(data);
            return;
        }
        if (index == size) {
            InsertLast(data);
            return;
        }
        Node secondLast = getIndex(index);
        Node node = new Node(data, secondLast.next);
        secondLast.next = node;
        size++;
    }

    public Node getIndex(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // ------------------------------------------------------------------------------
    // deletion
    public int deleteFirst() {
        Node temp = head;
        int val = temp.data;
        head = temp.next;
        size--;
        return val;
    }

    // --------------------------------------------------------------------------
    public int deleteLast() {
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    // ------------------------------------------------------------------------------
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    // ---------------------------------------------------------------------------------

    public void Reverse() {
        Node temp = head.next;
        Node nextNode;

        head.next = null;
        while (temp != null) {
            nextNode = temp.next;
            temp.next = head;
            head = temp;
            temp = nextNode;
        }
    }

    // ---------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
        System.out.println(size);

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(5);
        list.display();

    }

}