package Udemy_Practice.AbdulBariDSA.Array;

public class ArrayOperations {
    static int get(int[] A, int index) {
        if(index >= 0 && index < A.length) {
            return A[index];
        }
        return -1;
    }

    static void set(int[] A, int index, int x) {
        if(index >= 0 && index < A.length) {
            A[index] = x;
        }
    }

    static int max(int[] A) {
        int max = A[0];
        for(int i = 1; i < A.length; i++) {
            if(max < A[i]) max = A[i];
        }
        return max;
    }

    static int min(int[] A) {
        int min = A[0];
        for(int i = 1; i < A.length; i++) {
            if(min > A[i]) min = A[i];
        }
        return min;
    }

    static int sum(int[] A) {
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum+=A[i];
        }
        return sum;
    }

    static float avg(int[] A) {
        return (float) sum(A)/A.length;
    }

    public static void main(String[] args) {
        System.out.println(get(new int[]{2, 4, 6, 78, 3, 2}, 3));
//        System.out.println(set(new int[]{2, 4, 6, 78, 3, 2}, 3, 88));
        System.out.println(max(new int[]{2, 4, 6, 78, 3, 2}));
        System.out.println(min(new int[]{2, 4, 6, 78, 3, 2}));
        System.out.println(sum(new int[]{2, 4, 6, 78, 3, 2}));
        System.out.println(avg(new int[]{2, 4, 6, 78, 3, 2}));
    }
}
