package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Arrays;

public class LinearSearch {
    static int linear(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i])
                return i;
        }
        return -1;
    }
    // Using Transposition
    static int linearT(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                if(i>0) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
                return i;
            }
        }
        return -1;
    }
    //Using Move to head
    static int linearH(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                if(i>0) {
                    int temp = arr[i];
                    arr[i] = arr[0];
                    arr[0] = temp;
                }
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,34,7,8,12};
        System.out.println(linearH(arr, 34));
        System.out.println(Arrays.toString(arr));
    }
}
