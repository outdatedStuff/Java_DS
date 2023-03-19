package main;

import classes.Farfurie;
import classes.Stack_and_Queue;

public class main {

    public static void main(String[] args) {
        Farfurie f1=new Farfurie(1,5);
        Farfurie f2=new Farfurie(2,5);
        Farfurie f3=new Farfurie(3,5);
        Farfurie f4=new Farfurie(4,5);
        Farfurie f5=new Farfurie(5,5);

        Stack_and_Queue stack=new Stack_and_Queue();
        stack.push(f1);
        stack.push(f2);
        stack.push(f3);

        Farfurie ftest1=stack.pop();
        Farfurie ftest2=stack.pop();

        System.out.println(ftest1);
        System.out.println(ftest2);
        Farfurie f11=stack.pop();
        System.out.println(f11);

    }
}
