package w1.basic;

public class ArrayUtils {
    public static int sum(int a[]){
       // your code here
       int Sum = 0;
         for(int i = 0; i < a.length; i++){
              Sum += a[i];
         }
            return Sum;
    }

    public static int max(int a[]){
        // your code here
        int Max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > Max){
                Max = a[i];
            }
        }
        return Max;
    }

    public static int[] sort(int a[]){
        // your code here
        int n = a.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return a;
    }
}
