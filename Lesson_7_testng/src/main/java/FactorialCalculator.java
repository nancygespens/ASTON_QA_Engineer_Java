public class FactorialCalculator {

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return (number == 0) ? 1 : number * calculateFactorial(number - 1);
    }
}
