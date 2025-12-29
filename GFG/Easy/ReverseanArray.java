package GFG.Easy;

public class ReverseanArray {
    public void reverseArray(int arr[]) {
        // code here
        int i=0, temp;
        int j=arr.length-1;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
