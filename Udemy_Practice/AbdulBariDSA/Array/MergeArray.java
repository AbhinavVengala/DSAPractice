package Udemy_Practice.AbdulBariDSA.Array;

import java.util.Arrays;

public class MergeArray {
    static int[] merge(int[] A, int[] B) {
        int i=0,j=0,k=0;
        int[] C = new int[A.length+B.length];
        while(i<A.length&&j<B.length) {
            if(A[i]<B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
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

    public static void main(String[] args) {
        int[] A = {3,8,16,20,25};
        int[] B = {4,10,12,22,23};
        System.out.println(Arrays.toString(merge(A, B)));
    }
}
