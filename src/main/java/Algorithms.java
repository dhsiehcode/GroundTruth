public class Algorithms {

    public static int Fib(int n) {
        if (n <= 1) {
            return 1;
        }
        return Fib(n - 1) + Fib((n - 2));
    }

}
