package TUF.Arrays.Easy;

public class LargestinArray {
    public static int largest(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}
