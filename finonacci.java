public class finonacci {
    
    public static int fibonacciRecursive(int num) {
        if (num <= 1) return num;
        return fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
    }
    
    public static int fibonacciIterative(int num) {
        int sum = 0;
        
        for (int i = 0; i < num; i++) {
            if (i < 3){
                sum += i;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(10));
        System.out.println(fibonacciIterative(10));
    }
}
