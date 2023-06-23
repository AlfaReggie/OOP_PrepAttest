public class Operation implements Calculator {
    @Override
    public ComplNumOperation sum(ComplNumOperation a, ComplNumOperation b) {
        return a.sum(b);
    }

    @Override
    public ComplNumOperation differ(ComplNumOperation a, ComplNumOperation b) {
        return a.differ(b);
    }

    @Override
    public ComplNumOperation multiply(ComplNumOperation a, ComplNumOperation b) {
        return a.multiply(b);
    }

    @Override
    public ComplNumOperation divide(ComplNumOperation a, ComplNumOperation b) {
        return a.divide(b);
    }
}
