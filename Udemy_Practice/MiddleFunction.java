package Udemy_Practice;

// Middle Function
// Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

// myArray = [1, 2, 3, 4]
// middle(myArray)  # [2,3]. 

public class MiddleFunction {
    public static int[] middle(int[] array) {
        int[] result = new int[array.length-2];
        if(array.length <= 2) {
            return new int[0];
        }
        int index = 1;
        while(index < array.length - 1) {
            result[index-1]=array[index];
            index++;
        }
        return result;
    }
}