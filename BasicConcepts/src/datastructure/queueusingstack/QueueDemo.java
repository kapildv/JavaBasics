package datastructure.queueusingstack;

import java.util.Stack;

public class QueueDemo {

    static class Queue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }

    static void push(Stack<Integer> top_ref, int value) {
        top_ref.push(value);
    }

    static int pop(Stack<Integer> top_ref) {
        if (top_ref.isEmpty()) {
            System.out.print("Stack UnderFlow");
            System.exit(0);
        }
        return top_ref.pop();
    }

    static void enQueue(Queue q, int value) {
        q.stack1.push(value);
    }

    static int deQueue(Queue q) {
        int x;
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.print("Queue is Empty");
            System.exit(0);
        }

        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = q.stack1.pop();
                q.stack2.push(x);
            }
        }
        x = q.stack2.pop();
        return x;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();

        enQueue(q,1);
        enQueue(q,2);
        enQueue(q,3);
        enQueue(q,4);
        enQueue(q,5);
        enQueue(q,6);

//        System.out.println(deQueue(q));
//        System.out.println(deQueue(q));
//        System.out.println(deQueue(q));
//        System.out.println(deQueue(q));
//        System.out.println(deQueue(q));

        for (int i=0;i<7;i++) {
            System.out.println(deQueue(q));
        }

    }
}
