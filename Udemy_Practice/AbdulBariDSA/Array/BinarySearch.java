package Udemy_Practice.AbdulBariDSA.Array;

public class BinarySearch {
    static int binary(int[] A, int key) {
        int l = 0, h = A.length-1, mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) h = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    // Recursion approach
    static int RBinary(int[] A, int l, int h, int key) {
        int mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) {
                return RBinary(A, l, mid - 1, key);
            }
            else
                return RBinary(A, mid + 1, h, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {2,4,6,8,9,10,45};
        System.out.println(binary(A, 45 ));
        System.out.println(RBinary(A,0, A.length-1, 2 ));
    }
}
