package GFG.Basic;

public class SumofArray {
    int arraySum(int arr[]) {
        // code here
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
}
