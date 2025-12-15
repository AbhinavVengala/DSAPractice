package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Scanner;

class MenuProgramArray {
    int[] A;
    int size;
    int length;

    MenuProgramArray(int size) {
        this.size = size;
        A = new int[size];
        length = 0;
    }

    void display() {
        if (length == 0) {
            System.out.println("Array is empty");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    void append(int x) {
        if (length == size) {
            System.out.println("Array is full");
            return;
        }
        A[length++] = x;
    }

    void insert(int index, int x) {
        if (index < 0 || index > length) {
            System.out.println("Invalid index");
            return;
        }
        if (length == size) {
            System.out.println("Array is full");
            return;
        }
        for (int i = length; i > index; i--) {
            A[i] = A[i - 1];
        }
        A[index] = x;
        length++;
    }

    int delete(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid index");
            return -1;
        }
        int x = A[index];
        for (int i = index; i < length - 1; i++) {
            A[i] = A[i + 1];
        }
        length--;
        return x;
    }

    int linearSearch(int key) {
        for (int i = 0; i < length; i++) {
            if (A[i] == key)
                return i;
        }
        return -1;
    }
}

public class MenuDrivenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        MenuProgramArray arr = new MenuProgramArray(size);

        int choice;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to append: ");
                    arr.append(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter index and value: ");
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    arr.insert(index, value);
                    break;

                case 3:
                    System.out.print("Enter index to delete: ");
                    int delIndex = sc.nextInt();
                    int deleted = arr.delete(delIndex);
                    if (deleted != -1)
                        System.out.println("Deleted element: " + deleted);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int result = arr.linearSearch(key);
                    if (result != -1)
                        System.out.println("Element found at index: " + result);
                    else
                        System.out.println("Element not found");
                    break;

                case 5:
                    arr.display();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
