public class V2_a4_quantify {
    public static void main(String[] args) {
        abtasten(0.1, 2, 4);
    }

    private static double f(double x) {
        return 20 * (x * x) - 100 * x + 129.5;
    }

    private static void abtasten(double rate, double start, double end) {
        for (double i = start; i <= end; i += rate) {
            i = Math.round(i * 100.0) / 100.0;
            double res = f(i);
            if (i == 2.5)
                System.out.println("Minimum!");
            System.out.println("x-Wert: " + i + " | f(x): " + res + " | Quantisiert: " + (int) res);
        }
    }
}
