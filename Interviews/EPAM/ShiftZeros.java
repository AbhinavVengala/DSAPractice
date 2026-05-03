package Interviews.EPAM;

import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
        // Move all the zeros to the right without changing the order of the array.
        int[] arr = {10, 0, 3, 6, 1, 0, 0, 3, 0};
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
