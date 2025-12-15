package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Arrays;

public class SetOperations {
    static int[] union(int[] A, int[] B) {
        int i=0,j=0,k=0;
        int[] C = new int[A.length+B.length];
        while(i<A.length&&j<B.length) {
            if(A[i]<B[j]) {
                C[k++] = A[i++];
            } else if (B[j]<A[i]) {
                C[k++] = B[j++];
            } else {
                C[k++] = A[i++];
                j++;
            }
        }
        for (; i < A.length; i++) {
            C[k++] = A[i];
        }
        for (; j < B.length; j++) {
            C[k++] = B[j];
        }
        return C;
    }

    static int[] intersection(int[] A, int[] B) {
        int i=0,j=0,k=0;
        int[] C = new int[A.length+B.length];
        while(i<A.length&&j<B.length) {
            if(A[i]<B[j]) {
                i++;
            } else if (B[j]<A[i]) {
                j++;
            } else if(A[i]==B[j]){
                C[k++] = A[i++];
                j++;
            }
        }
        return C;
    }

    static int[] difference(int[] A, int[] B) {
        int i=0,j=0,k=0;
        int[] C = new int[A.length+B.length];
        while(i<A.length&&j<B.length) {
            if(A[i]<B[j]) {
                C[k++] = A[i++];
            } else if (B[j]<A[i]) {
                j++;
            } else {
                i++; j++;
            }
        }
        for (; i < A.length; i++) {
            C[k++] = A[i];
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = {3,8,10,20,25};
        int[] B = {4,10,12,22,23};
        System.out.println(Arrays.toString(union(A, B)));
        System.out.println(Arrays.toString(intersection(A, B)));
        System.out.println(Arrays.toString(difference(A, B)));
    }
}
