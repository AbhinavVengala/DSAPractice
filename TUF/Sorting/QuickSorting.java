package TUF.Sorting;

public class QuickSorting {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[low];
        int i=low; int j = high;
        while(i<j) {
            while(arr[i]<=pivot && i<=high-1) i++;
            while(arr[j]>pivot && j>low) j--;
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
// TC = O(N log N)
// SC = O(1)