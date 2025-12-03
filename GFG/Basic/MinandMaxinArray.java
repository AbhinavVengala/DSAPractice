package GFG.Basic;

import java.util.ArrayList;

public class MinandMaxinArray {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int max,min;
        min=arr[0];
        max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        ans.add(0, min);
        ans.add(1, max);
        return ans;
    }
}
