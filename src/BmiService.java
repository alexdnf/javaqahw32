public class BmiService {

    public int calculate(double height_m, int weight_kg) {
        double bmi = weight_kg / Math.pow(height_m, 2);
        return (int) bmi;
    }
}
