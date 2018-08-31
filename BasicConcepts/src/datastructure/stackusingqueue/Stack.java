package datastructure.stackusingqueue;

import java.util.Queue;

public class Stack {

    Queue<Integer> q1;
    Queue<Integer> q2;


    int current_size;
    public Stack(){

    }

    public void push(int value){
        current_size++;

    }
}
