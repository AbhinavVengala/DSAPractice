package GFG.Easy;

public class MissinginArray {
    int firstMissingNum(int[] arr) {
        // code here
        long array_sum = 0;
        long n=arr.length+1;
        long natural_sum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++) {
            array_sum +=arr[i];
        }
        return (int) (natural_sum-array_sum);
    }

    void missingNum(int[] arr) {
        // code here
        long diff = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i] - i != diff){
                System.out.println("Missing Element "+ i+diff);
                break;
            }
        }
    }

    static void multipleMissingNum(int[] arr) {
        long diff = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - 1 != diff) {
                while (diff<arr[i]-i) {
                    System.out.println(i+diff);
                    diff++;
                }
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(multipleMissingNum(new int[]{6,7,8,9,11,12,15,16,17,18,19}));
    }
}
