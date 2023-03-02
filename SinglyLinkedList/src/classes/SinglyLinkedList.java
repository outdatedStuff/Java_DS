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
