package GFG.Basic;

public class Factorial {
    int factorial(int n) {
    // code here
    int fact = 1;
    for(int i=n; i>0; i--) {
        fact*=i;
    }
    return fact;
}
}
