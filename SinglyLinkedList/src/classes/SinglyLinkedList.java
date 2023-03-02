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

    public void sortCapacity(){
        if(head==null) return;
        Node aux=head;

        while(aux.next!=null){
            Node temp=aux.next;
            while(temp!=null){
                if(aux.avion.capacitate>temp.avion.capacitate){
                    Avion a=aux.avion;
                    aux.avion=temp.avion;
                    temp.avion=a;
                }

                temp=temp.next;
            }
            aux=aux.next;
        }



    }

    public int sumaCapacitati(){
        if(head==null) return 0;

        int sum=0;
        Node aux=head;
        while(aux!=null){
            sum+=aux.avion.capacitate;
            aux=aux.next;
        }
        return sum;
    }
    public Node findNodeCapacity(int capacity){
        if(head==null) throw new Error("E null, nu se poate");

        Node aux=head;
        while(aux!=null){
            if(aux.avion.capacitate==capacity)
                return aux;
            aux=aux.next;
        }

        return new Node(new Avion("Negasit",0));
    }

    public void insertPosition(int position,Avion a){
        if (head==null) return;
        Node nou=new Node(a);
        nou.next=null;
        Node aux=head;
        int cnt=1;

        if(position==1)
            insertBeginning(a);
        if(position==getListLength(head)-1)
            insertFinal(a);

        while(aux.next!=null&&cnt<position){
            cnt++;
            aux=aux.next;
        }

        if(!(aux.next!=null))
            insertFinal(a);
        else
        {
            Node temp=aux.next;
            aux.next=nou;
            nou.next=temp;
        }
    }

    public void deletePosition(int position){
        Node aux=head;

        int cnt=1;
        if(position==0){
            head=head.next;
        }
        else{
            while(aux.next!=null&&cnt<position){
                cnt++;
                aux=aux.next;
            }

            if(aux.next!=null&&aux.next.next!=null){
                Node t=aux.next;
                aux.next=t.next;
            }
            else {
                aux.next=null;
            }

           // System.out.println(aux.next.avion);
        }

    }


    public void reverseList(){
        Node current=head;
        Node next=null;
        Node prev=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
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
