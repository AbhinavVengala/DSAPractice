package TUF.Recursion;

public class ReverseArray {
    static int[] reverse(int[] arr, int l, int r) {
        if(l>=r) return arr;
        int temp = 0;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverse(arr, l+1, r-1);
    }

    public static void main(String[] args) {
        int[] arr = {4,2,6,7,8,2,6};
        int l=0; int r=arr.length-1;
        int[] ans = reverse(arr, l, r);
        for(int a: ans) {
            System.out.print(a+", ");
        }
    }
}
