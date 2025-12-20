package Udemy_Practice.AbdulBariDSA.Array;

public class Duplicate {
    public static void main(String[] args) {
//        int[] A = {3,6,8,8,10,12,15,15,15,20};
        // Print the duplicate elements
//        int lastDuplicate = 0;
//        for (int i = 0; i < A.length-1; i++) {
//            if(A[i] == A[i+1] && A[i] != lastDuplicate) {
//                System.out.println(A[i]);
//                lastDuplicate = A[i];
//            }
//        }

        // Count the duplicate elements
//        for (int i = 0; i < A.length-1; i++) {
//            if(A[i] == A[i+1]) {
//                int j = i+1;
//                while(A[j] == A[i]) j++;
//                int diff = j-i;
//                System.out.println(A[i] + " is appearing for " + diff + " times");
//                i = j-1;
//            }
//        }

        // Finding duplicates using hashing
//        int[] H = new int[A[A.length-1]+1];
//        for (int i = 0; i < A.length; i++) {
//            H[A[i]]++;
//        }
//        for (int i = 0; i < H.length; i++) {
//            if(H[i] > 1) System.out.println(i + " appears " + H[i] + " times");
//        }

        // Finding duplicates in unordered array
        int[] U = {8,3,6,4,6,5,6,8,2,7};
//        for (int i = 0; i < U.length - 1; i++) {
//            if (U[i] == -1)
//                continue;
//            int count = 1;
//            for (int j = i + 1; j < U.length; j++) {
//                if(U[i] == U[j]) {
//                    count++;
//                    U[j] = -1;
//                }
//            }
//            if(count > 1) System.out.println(U[i] +" " + count);
//        }

        // Using HashTable or BitSet
//        int max = U[0];
//        for (int i = 1; i < U.length; i++) {
//            if (U[i] > max) {
//                max = U[i];
//            }
//        }
//        int[] H = new int[max+1];
//        for (int i = 0; i < U.length; i++) {
//            H[U[i]]++;
//        }
//        for (int i = 0; i < H.length; i++) {
//            if(H[i] > 1) System.out.println(i + " appears " + H[i] + " times");
//        }

        // Finding a pair of elements using sum
        int key = 10;
        int[] arr = {6,3,8,10,16,7,5,2,9,14,0};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]+arr[j] == key) {
//                    System.out.println(arr[i]+ " + " + arr[j] + " = " + key);
//                }
//            }
//        }

        // Using Hashing
//        int max = arr[0];
//        for (int i = 1; i < U.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        int[] H = new int[Math.max(max, key) +1];
//        for (int i = 0; i < arr.length; i++) {
//            int x = arr[i];
//            int y = key - x;
//            if (y >= 0 && y < H.length && H[y] > 0) {
//                System.out.println(x + " + " + y + " = " + key);
//            }
//            H[x]++;
//        }

        // Two pointer approach
//        int i=0, j=arr.length-1;
//        while(i<j) {
//            if(arr[i] + arr[j] == key) {
//                System.out.println(arr[i] + " + " + arr[j] + " = " + key);
//                i++;
//                j--;
//            } else if (arr[i] + arr[j] < key) {
//                i++;
//            } else {
//                j--;
//            }
//        }

        // finding max and min in a single scan
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < min) min = arr[i];
//            else if (arr[i]>max) max = arr[i];
//        }
//        System.out.println("Max: "+ max + " " + "Min: " + min);
    }
}
