public class BmiService {
    public double calculate(double heightMeter, int weightKilogram) {
        double index = weightKilogram / (heightMeter * heightMeter);
        return index;
    }
}