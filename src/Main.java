public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        double weight = 98;
        int index = service.calculate(heightInMeters, weight);
        System.out.println(index);
    }
}