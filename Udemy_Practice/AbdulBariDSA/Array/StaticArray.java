package Udemy_Practice.AbdulBariDSA.Array;

public class StaticArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        arr[0] = 3;
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
