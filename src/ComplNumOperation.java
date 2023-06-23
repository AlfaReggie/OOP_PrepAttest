public class ComplNumOperation {
    private double real;
    private double imaginary;

    public ComplNumOperation(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplNumOperation sum(ComplNumOperation other) {
        return new ComplNumOperation(real + other.real, imaginary + other.imaginary);
    }

    public ComplNumOperation differ(ComplNumOperation other) {
        return new ComplNumOperation(real - other.real, imaginary - other.imaginary);
    }

    public ComplNumOperation multiply(ComplNumOperation other) {
        return new ComplNumOperation(real * other.real - imaginary * other.imaginary,
                real * other.imaginary + imaginary * other.real);
    }

    public ComplNumOperation divide(ComplNumOperation other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new ComplNumOperation((real * other.real + imaginary * other.imaginary) / denominator,
                (imaginary * other.real - real * other.imaginary) / denominator);
    }
}
