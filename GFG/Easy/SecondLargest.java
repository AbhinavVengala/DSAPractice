package GFG.Easy;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=-1;
        int secondLargest=-1;
        for(int i: arr) {
            if(i>largest) {
                secondLargest = largest;
                largest = i;
            } else if(i<largest && i>secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
