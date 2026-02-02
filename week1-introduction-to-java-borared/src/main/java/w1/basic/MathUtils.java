package w1.basic;

public class MathUtils {
    public static int add(int a, int b){
        // your code here
        return a + b;
    }

    public static int max(int a, int b){
        // your code here
        return a > b ? a : b;
    }

    public static boolean isEven(int a){
        // your code here
        return a % 2 == 0;
    }

    public static int factorial(int a){
        // your code here
        int resultFact = 1;
        for(int i = 1; i <= a; i++){
            resultFact *= i;
        }
        return resultFact;
    }
}
