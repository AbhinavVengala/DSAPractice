package TUF.Sorting;

public class RecursionBubbleCort {
    public void bubbleSort(int[] arr) {
        // code here
        bubbleSortRec(arr, arr.length);
    }
    public void bubbleSortRec(int arr[], int n){
        if(n==1) return;
        for (int i=0;i<n-1;i++) {
            if(arr[i]>arr[i+1]) swap(arr, i, i+1);
        }
        bubbleSortRec(arr, n-1);
    }
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
