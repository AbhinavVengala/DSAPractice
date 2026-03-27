package Udemy_Practice.Telusko;

import java.util.NoSuchElementException;

public class Queue {

    private int front=0;
    private int rear=-1;
    private int size=0;
    private int[] arr = new int[4];


    public void enqueue(int data) {
        if(!isFull()) {
            rear++;
            arr[rear] = data;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void circularEnqueue(int data) {
        rear = (rear + 1) % 4;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = arr[front];
        front++;
        size--;
        return data;
    }

    public int circularDequeue() {
        int data = arr[front];
        front =  (front + 1) % 4;
        size--;
        return data;
    }

    public boolean isFull() {
        return size == 4;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void show() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.show();
    }
}
