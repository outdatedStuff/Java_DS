package main;

import classes.Avion;
import classes.DoublyLinkedList;

public class main {
    public static void main(String[] args) {
        Avion a1=new Avion("Avion1",1);
        Avion a2=new Avion("Avion2",2);
        Avion a3=new Avion("Avion3",3);
        Avion a4=new Avion("Avion4",4);
        Avion a5=new Avion("Avion5",5);
        Avion a6=new Avion("Avion6",6);
        Avion a7=new Avion("Avion7",7);

        DoublyLinkedList list=new DoublyLinkedList();

        list.insertBeginning(a1);
        list.insertBeginning(a2);
        list.insertFinal(a3);
        list.insertFinal(a4);
        list.insertBeginning(a1);
        list.print();


        System.out.println("\n Dupa Stergere:  \n");
        list.deleteNode(1);
        list.deleteNode(1);

        list.deleteNode(4);
        list.deleteNode(3);
        list.deleteNode(2);
        list.print();

    }
}
