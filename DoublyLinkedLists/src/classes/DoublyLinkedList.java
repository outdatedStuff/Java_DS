package classes;

public class DoublyLinkedList {
    Node first;
    Node last;

    public DoublyLinkedList(){};

    public void insertBeginning(Avion a){
        Node newNode=new Node(a);
        newNode.next=null;
        newNode.prev=null;

        if(first==null){
            first=newNode;
            last=newNode;
        }
        else{
           newNode.next=first;
           first=newNode;
        }

    }

    public void deleteNode(int capacitate){
        if(first==null)return;

        if(first.info.capacitate==capacitate&&first.next!=null){
            first=first.next;
        }
        else {
            Node aux=first;
            while(aux.next!=null&&aux.next.info.capacitate!=capacitate)
                aux=aux.next;

            if(aux.next.info.capacitate==capacitate&&aux.next.next!=null){
                    Node temp=aux.next;
                    aux.next=temp.next;
                    temp.next.prev=aux;
                    last=aux.next;
            }
            else {
                last=aux;
                aux.next=null;
            }

        }

    }

    public void insertFinal(Avion a){
        if(first==null) insertBeginning(a);
        Node newNode=new Node(a);

        Node aux=first;
        while(aux.next!=null)
            aux=aux.next;


        aux.next=newNode;
        newNode.prev=aux;
        last=newNode;



    }
    public  void print(){
        Node aux=first;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.next;
        }
    }
}
