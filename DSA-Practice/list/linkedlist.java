package list;

 class linkedlist {

    public ListNode head;
    public ListNode tail;
    public int size = 0;

    public class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    // inserting the element in the list in first position

    public void InsertFirst(int data) {
        ListNode node = new ListNode(data);
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
        ListNode node = new ListNode(data);
        tail.next = node;
        tail = node;
        size++;

    }

    public void InsertLastN(linkedlist l){

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
        ListNode secondLast = getIndex(index);
        ListNode node = new ListNode(data, secondLast.next);
        secondLast.next = node;
        size++;
    }

    public ListNode getIndex(int index) {
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // ------------------------------------------------------------------------------
    // deletion
    public int deleteFirst() {
        ListNode temp = head;
        int val = temp.data;
        head = temp.next;
        size--;
        return val;
    }

    // --------------------------------------------------------------------------
    public int deleteLast() {
        ListNode temp = head;
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
        ListNode temp = head;
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
        ListNode temp = head.next;
        ListNode nextNode;

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
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
        System.out.println(size);

    }

    public void reOrder(ListNode head){
        ListNode firstP = head;
        ListNode secondP = firstP.next;
        ListNode temp = head;
        ListNode tail = head;
        ListNode prev = head;
        ListNode even = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        while(secondP != null){
            even = firstP;
            temp = head;
            while(temp != null){
            tail = temp;
            temp = temp.next;
        }
            temp = head;
            int s = 0;
            while(s < size-1){
            prev = temp;
            temp = temp.next;
            s++;
        }
            firstP.next = tail;
            tail.next = secondP;
            prev.next = null;
            firstP = secondP;
            secondP = firstP.next;
            

        }
        if(size % 2 == 0){
            tail.next = even;
            even.next = null;
        }
     
    }

    //---------------------------------------------------------------------------------------

     public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
         if(size == 1 || size == 0 && n == 1){
            return null;
        }
        temp = head;
        ListNode nNode = head;
        ListNode prev = head;
        int pos = size - n;
        if(size - n == 0){
        head = nNode.next;
        return head;
        }
       
        int s = 0;
        while(s < pos){
            nNode = nNode.next;
            s++;
        }
        s = 0;
        while(s < pos - 1){
            prev = prev.next;
            s++;
        }
        prev.next = nNode.next;
        return head;

    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        if(lists.length == 0){
            return ans.next;
        }
        if(lists[0] != null){
            ListNode temp = lists[0];
            while(temp != null){
                ans.next = temp;
                temp = temp.next;
            }
        }
        ListNode f = ans;
        ListNode s = f.next;

        for(int i = 1; i < lists.length; i++){
            ListNode temp = lists[i];
            while(temp != null){
                if(s == null){
                f.next = temp;
                s = temp;
            }
            if(temp.data <= f.data && temp.data >= s.data){
                f.next = temp;
                temp.next = s;
                s = temp;
            }
            else{
                f = s;
                s = f.next;
            }
            temp = temp.next;
            }
        f = ans;
        s = f.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        linkedlist l1 = new linkedlist();
        l1.InsertLast(1);
        l1.InsertLast(3);
        l1.InsertLast(4);

        list.InsertLastN(l1);

    

    }

}