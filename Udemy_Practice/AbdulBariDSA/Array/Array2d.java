package Udemy_Practice.AbdulBariDSA.Array;

public class Array2d {
    public static void main(String[] args) {
        int[][] arr2 = {{1,2,3,4},{2,4,6,8},{3,5,7,9}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <= arr2.length; j++) {
                System.out.print(arr2[i][j]);
            }
        }

    }
}
