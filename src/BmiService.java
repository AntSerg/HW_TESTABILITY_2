public class BmiService {
    int calculate (double heightInMeters, double weight) {
        return (int)(weight / Math.pow(heightInMeters, 2));
    }
}
