package main;

import classes.Avion;
import classes.Node;
import classes.SinglyLinkedList;

public class main {
    public static void main(String[] args) {

        Avion a1=new Avion("Avion1",1);
        Avion a2=new Avion("Avion2",2);
        Avion a3=new Avion("Avion3",3);
        Avion a4=new Avion("Avion4",4);
        Avion a5=new Avion("Avion5",5);
        Avion a6=new Avion("Avion6",6);
        Avion a7=new Avion("Avion7",7);


        SinglyLinkedList list=new SinglyLinkedList();
        list.insertBeginning(a1);
        list.insertBeginning(a2);
        list.insertFinal(a3);
        list.insertFinal(a4);
        //  list.StergeCapactitate(1);
        //list.print();
       // list.sortCapacity();

       // list.insertPosition(2,new Avion("Avion temp",5));
        list.print();

//        System.out.println("\n ----- POZITIE DE STERS ----- \n");
//        list.deletePosition(2);
//        list.deletePosition(0);
//        System.out.println("\n ----- Dupa Stergere ----- \n");
       // list.print();
        //list.print();
       // Node found=list.findNodeCapacity(3);
       // System.out.println(found.avion);

        list.reverseList();
        System.out.println("\n ----- Dupa Reverse ----- \n");
        list.print();


    }
}
