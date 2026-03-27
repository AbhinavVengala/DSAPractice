package Udemy_Practice.Telusko;

//import java.util.LinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedLists {
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    private void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void delete(int data) {
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedLists nums = new LinkedLists();
        nums.add(1);
        nums.add(2);
        nums.add(9);
        nums.addFirst(6);
//        nums.peek(2);
        nums.delete(9);
        nums.print();
    }




}
