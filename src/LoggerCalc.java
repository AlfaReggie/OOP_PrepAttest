import java.util.logging.Logger;

public class LoggerCalc implements Calculator {
    private static final Logger logger = Logger.getLogger(LoggerCalc.class.getName());
    private final Calculator calculator;

    public LoggerCalc(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public ComplNumOperation differ(ComplNumOperation a, ComplNumOperation b) {
        ComplNumOperation result = calculator.differ(a, b);
        logger.info(String.format("%s - %s = %s", a, b, result));
        return result;
    }

    @Override
    public ComplNumOperation sum(ComplNumOperation a, ComplNumOperation b) {
        ComplNumOperation result = calculator.sum(a, b);
        logger.info(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    @Override
    public ComplNumOperation multiply(ComplNumOperation a, ComplNumOperation b) {
        ComplNumOperation result = calculator.multiply(a, b);
        logger.info(String.format("%s * %s = %s", a, b, result));
        return result;
    }

    @Override
    public ComplNumOperation divide(ComplNumOperation a, ComplNumOperation b) {
        ComplNumOperation result = calculator.divide(a, b);
        logger.info(String.format("%s / %s = %s", a, b, result));
        return result;
    }
}