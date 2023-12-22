public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int imt = service.calculate(1.75, 69);
        System.out.println(imt);
    }
}