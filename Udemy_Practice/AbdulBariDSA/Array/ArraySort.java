package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Arrays;

public class ArraySort {
    static int[] insertSort(int[] A, int n) {
        int[] B = new int[A.length + 1];
        int i = A.length-1;
        while(i>=0 && A[i]>n){
            B[i+1] = A[i];
            i--;
        }
        B[i+1] = n;
        for (int j = 0; j <= i; j++) {
            B[j] = A[j];
        }
        return B;
    }

    static boolean isSorted(int[] A) {
        for(int i = 0; i < A.length-1; i++) {
            if(A[i] > A[i+1]) return false;
        }
        return true;
    }

    static int[] rearrange(int[] A) {
        int i=0, j=A.length-1;
        while(i<j) {
            while (A[i] < 0) i++;
            while (A[j] >= 0) j--;
            if(i<j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertSort(new int[]{2, 4, 6, 8, 9}, 3)));
        System.out.println(isSorted(new int[]{2, 4, 8, 6, 9}));
        System.out.println(Arrays.toString(rearrange(new int[]{2, 4, -8, -6, 9})));
    }
}
