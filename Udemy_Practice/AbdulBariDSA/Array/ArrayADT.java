package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Scanner;

public class ArrayADT {
    int[] arr;
    int size;
    int length;

    ArrayADT(int size) {
        this.size = size;
        arr = new int[size];
        length = 0;
    }

    void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void insert(int index, int value) {
        if (index < 0 || index > length) return;
        for (int i = length; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        length++;
    }

    void delete(int index) {
        if (index < 0 || index >= length) return;
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        length--;
    }

    int search(int key) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    void append(int value) {
        if(length<size) {
            arr[length] = value;
            length++;
        } else {
            System.out.println("Array is full");
        }
    }

    public static void main(String[] args) {
        ArrayADT array = new ArrayADT(20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of numbers ");
        int n = sc.nextInt();
        System.out.println("Enter number of Elements ");
        for (int i = 0; i < n; i++) {
            array.arr[i] = sc.nextInt();
            array.length++;
        }
        System.out.println("Array elements:");
        array.display();
        array.insert(2, 99);
        System.out.println("After insertion:");
        array.display();
    }
}
