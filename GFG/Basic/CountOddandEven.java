package GFG.Basic;

public class CountOddandEven {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] A = new int[2];
        int odd=0, even=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        A[0]=odd;
        A[1]=even;
        return A;
    }
}
