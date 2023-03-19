package classes;

public class Stack_and_Queue {
    // Urmeaza LIFO
    Node head;

   public void push(Farfurie farfurie){
        Node newNode=new Node(farfurie);
        newNode.next=null;

        if(head==null){
            head=newNode;
        }
        else{
            Node aux=head;
            while (aux.next!=null)
                aux=aux.next;

            aux.next=newNode;
        }
    }

    public Farfurie pop(){
        Farfurie f;
       if(head!=null){
           Node aux=head;
           Node prev=null;
           while(aux.next!=null){
               prev=aux;
               aux=aux.next;
           }

            f=aux.info;
           if(prev==null)
               head=null;
           else
           prev.next=null;
       }
       else {
           f=new Farfurie(0,0);
       }
       return f;
    }


    void print(){
       while(head!=null){
           System.out.println(head.info.toString());
            head=head.next;
       }
    }

}
