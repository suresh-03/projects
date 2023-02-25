package LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        link a = new link();

        a.addNode(10);

        a.addNode(20);

        a.addNode(30);

        a.addNode(40);

        a.addNode(50);

        System.out.println(a.find(40));

        a.print();

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class link {
    Node head;

    public link() {
        this.head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean find(int num) {
        Node temp = head;
        Node number = new Node(num);
        while (temp != null) {
            if (number.equals(temp)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
