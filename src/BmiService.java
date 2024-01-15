public class BmiService {
    public int calculate(double heightMeter, int weightKilogram) {
        double index = weightKilogram / (heightMeter * heightMeter);
        return (int) index;
    }
}