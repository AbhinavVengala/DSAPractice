package Udemy_Practice.Telusko;

public class Stacks {

    private int[] arr = new int[10];
    int top;
    int size;

    public Stacks(){
        size = arr.length;
        top = -1;
    }

    public void push(int data){
        if (top < size)
            arr[++top] = data;
        else
            System.out.println("Stack Overflow");
    }

    public int pop(){
        if (top < 0)
            System.out.println("Stack Underflow");
        return arr[top--];
    }

    public int peek(){
        if (top < 0)
            System.out.println("Stack Underflow");
        return arr[top];
    }

    public void printStack(){
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        stacks.push(10);
        stacks.push(70);
        stacks.pop();
        stacks.push(30);
        stacks.push(40);
        System.out.println(stacks.peek());
        stacks.printStack();
        System.out.println(stacks);
    }
}
