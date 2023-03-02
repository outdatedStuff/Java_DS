package classes;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){};

    public void insertBeginning(Avion a){
        Node aux=new Node(a);
        aux.next=null;
        if(head==null){
           head=aux;
        }
        else{
            aux.next=head;
            head=aux;
        }
    }
    public void insertFinal(Avion a){
        Node newNode=new Node(a);

        Node aux=head;
        if(head==null){
            insertBeginning(a);
        }
        else {
            while(aux.next!=null)
                aux=aux.next;

            aux.next=newNode;
        }
    }
    public void DeleteCapacity(int capacitate){
        Node aux=head;
       if(head==null) {
           System.out.println("List is empty!");
           return;
       };

        if(aux.avion.capacitate==capacitate){
            head=head.next;
        }
        else {
            while(aux.next!=null&&aux.next.avion.capacitate!=capacitate)
                aux=aux.next;

            Node temp=aux;
            if(aux.next.avion.capacitate==capacitate){
                temp=aux.next;
                aux.next=temp.next;
            }
        }
    }
    public void print(){
        Node aux=head;
        while(aux!=null){
            Avion a=aux.avion;
            System.out.println(aux.avion.toString()+" \n");
            aux=aux.next;
        }


    }

    public int getListLength(Node head){
        if(head==null) return 0;
        int cnt=0;
        Node aux=head;
        while(aux!=null){
            cnt++;
            aux=aux.next;
        }
        return cnt;
    }

}
