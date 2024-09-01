package adv_DS;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class linkedlist {
    Node head;
//deletion
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty, nothing to delete.");
            return;
        }
        
        head = head.next;  
    }
//traverse
    public void traverse(){
    Node current = head;

    while (current != null){
        System.out.println(current.data+"");
        current = current.next;
    }
    System.out.println();
    }
//insertion
    public void add(int data){
        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;

        }
        else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
        public static void main (String args []){
            linkedlist list = new linkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.deleteAtBeginning();
        System.out.println("Linked List Elements:");
        list.traverse();  // Expected output: 1 2 3 4
    }
}
    