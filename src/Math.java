public class Math {
    public static int factorial(int number) {
        if (number <= 2)
            return number;

        return number * factorial(number - 1);
    }

    public static int disposition(int objects, int positions) {
        return factorial(objects) / factorial(objects - positions);
    }
}
