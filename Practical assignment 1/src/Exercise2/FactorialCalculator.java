package Exercise2;

public class FactorialCalculator {
    public static long factorialLoop(int n){
        long result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }
    public static long factorialRecursive(int n){
        if (n == 1){
            return 1;
        }
        return n * factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Loop 5! = " + factorialLoop(5) + "\nRecursive 5! = " + factorialRecursive(5));
    }
}
