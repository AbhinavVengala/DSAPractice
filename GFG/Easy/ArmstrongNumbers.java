package GFG.Easy;

public class ArmstrongNumbers {
        static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0;
        int k =String.valueOf(n).length();
        while(temp>0){
            int digit=temp%10;
            sum = sum + (int) Math.pow(digit,k);
            temp/=10;
        }
        return sum == n;
    }
}
