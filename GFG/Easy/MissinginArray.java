package GFG.Easy;

public class MissinginArray {
    int missingNum(int[] arr) {
        // code here
        long array_sum = 0;
        long n=arr.length+1;
        long natural_sum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++) {
            array_sum +=arr[i];
        }
        return (int) (natural_sum-array_sum);
    }
}
