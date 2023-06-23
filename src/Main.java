public class Main {
    public static void main(String[] args) {
        Calculator calculator = new LoggerCalc(new Operation());

        ComplNumOperation a = new ComplNumOperation(5, 1);
        ComplNumOperation b = new ComplNumOperation(3, 9);

        ComplNumOperation sum = calculator.sum(a, b);
        System.out.println("Sum: " + sum);

        ComplNumOperation multiply = calculator.multiply(a, b);
        System.out.println("Multiply: " + multiply);

        ComplNumOperation divided = calculator.divide(a, b);
        System.out.println("Divide: " + divided);

        ComplNumOperation difference = calculator.divide(a, b);
        System.out.println("Difference: " + difference);
    }
}
