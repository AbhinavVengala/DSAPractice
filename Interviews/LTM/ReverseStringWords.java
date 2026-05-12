package Interviews.LTM;

public class ReverseStringWords {
    // Practice
    public static void main(String[] args) {
        String str = "I love Java";
//        String[] arr = str.split(" ");
//        String result = "";
//        for (int i = arr.length - 1; i >= 0; i--) {
//            result += arr[i] + " ";
//        }
//        System.out.print(result.toString().trim());

    // Using String Builder
        StringBuilder result = new StringBuilder();
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]);
        }
        System.out.println(result.toString());
    }
}
