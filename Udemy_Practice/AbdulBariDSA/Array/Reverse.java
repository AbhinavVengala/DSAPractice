package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Arrays;

public class Reverse {
    static int[] reverse(int[] A) {
        int[] B = new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++) {
            B[j] = A[i];
        }
        for(int i=0;i<A.length;i++){
            A[i] = B[i];
        }
        return A;
    }

    static int[] reverseSwap(int[] A) {
        for(int i=0,j=A.length-1;i<j;i++,j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(reverse(new int[]{2, 4, 6, 8, 9})));
        System.out.println(Arrays.toString(reverseSwap(new int[]{2, 4, 6, 8, 9})));
    }
}
