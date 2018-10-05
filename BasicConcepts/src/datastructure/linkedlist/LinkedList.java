package datastructure.linkedlist;

public class LinkedList {

    Node head;

    private void addNode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    private void printLinkedList() {
        Node temp = head;
        if (temp == null) {
            System.out.print("No Nodes available");
        } else {
            while (temp.next != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

    private int getMidPoint() {
        Node temp1 = head;
        Node temp2 = temp1;
        int count = 1;
        while (temp2.next != null && temp2.next.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            count++;
        }
        return count;
    }

    private void reverseLinkedList() {
        Node ptr1 = head.next;
        Node ptr2 = head;
        Node temp = null;

        while (ptr1 != null) {
            ptr2.next = temp;
            temp = ptr2;
            ptr2 = ptr1;
            ptr1 = ptr1.next;
        }
        ptr2.next = temp;
        head = ptr2;
    }

    private void deleteNthNode(int n) {
        int count = 1;
        Node temp = head;
        if (n == 1) {
            head = temp.next;
            return;
        }
        while (temp.next != null && count < n - 1) {
            temp = temp.next;
            count++;
        }

        if (temp.next != null) {
            Node ptr = temp.next;
            temp.next = temp.next.next;
            ptr = null;
        }
        System.out.println();
    }

    private boolean isLoop() {
        Node ptr1 = head;
        Node ptr2 = head;
        while (ptr1.next != null && ptr2.next.next != null) {
            if (ptr1.next == ptr2.next.next) {
                ptr1.next.next = null;
                return true;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        return false;
    }

    private Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        Node head = linkedList.getHead();
        head.next.next.next = head.next;
        System.out.println(linkedList.isLoop());
        linkedList.printLinkedList();

//
//        linkedList.printLinkedList();
//        System.out.println();
//        System.out.println("Mid Point is : " + linkedList.getMidPoint());
//        linkedList.reverseLinkedList();
//        linkedList.printLinkedList();
//        linkedList.deleteNthNode(1);
//        System.out.println();
//        linkedList.printLinkedList();
//        System.out.println();
//        System.out.println(linkedList.isLoop());
    }
}
