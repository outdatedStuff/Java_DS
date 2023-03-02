package main;

import classes.Avion;
import classes.Node;
import classes.SinglyLinkedList;

public class main {
    public static void main(String[] args) {

        Avion a1=new Avion("Avion1",1);
        Avion a2=new Avion("Avion2",2);
        SinglyLinkedList list=new SinglyLinkedList();
        list.insertBeginning(a1);

        list.print();



    }
}
