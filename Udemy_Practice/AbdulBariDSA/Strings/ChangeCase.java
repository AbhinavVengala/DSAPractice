package Udemy_Practice.AbdulBariDSA.Strings;

public class ChangeCase {
    public static void main(String[] args) {
        char[] str = {'A', 'B', 'H', 'I'};
        for (int i = 0; i< str.length; i++) {
            if(str[i] >=65 && str[i] <= 90){
                str[i] += 32;
            } else if (str[i] >= 97 && str[i] <= 122) {
                str[i] -= 32;
            }
        }
        System.out.println(str);
    }
}
