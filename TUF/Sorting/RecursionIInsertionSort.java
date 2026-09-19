package TUF.Sorting;

public class RecursionIInsertionSort {
    public void recursiveInsertionSort(int[] arr) {
        insertionSortRec(arr, arr.length);
    }

    public void insertionSortRec(int[] arr, int n){
        if(n==1) return;
        insertionSortRec(arr, n-1);
        int key = arr[n - 1];
        int j= n-2;
        while(j>0&&arr[j]>key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
