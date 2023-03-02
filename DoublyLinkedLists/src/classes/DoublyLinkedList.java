package classes;

public class DoublyLinkedList {
    Node first;
    Node last;

    public DoublyLinkedList(){};

    public void insertBeginning(Avion a){
        Node newNode=new Node(a);
        newNode.next=null;
        newNode.prev=null;

        if(first==null){}

    }
}
