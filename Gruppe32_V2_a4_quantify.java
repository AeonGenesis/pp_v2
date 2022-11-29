public class Gruppe32_V2_a4_quantify {
    public static void main(String[] args) {//Inputwerte: Abtastrate, -star, -ende

        abtasten(0.1, 2, 4); //Werte fuer Abtastmethode
    }

    private static double f(double x) {//Funktionsberechnung
        return 20 * (x * x) - 100 * x + 129.5;
    }

    private static void abtasten(double rate, double start, double end) { //Abtast Methode
        for (double i = start; i <= end; i += rate) { //fuer i('startwert+1') kleiner gleich endwert
            i = Math.round(i * 100.0) / 100.0; //Begrenzung Nachkommastellen (sonst ungenaues Ergebnis)
            double res = f(i); // Rundenwerte in Funktionsberechnung schicken und in double res speichern
            if (i == 2.5) // WENN Minimum erreicht
                System.out.println("Minimum!");
            System.out.println("x-Wert: " + i + " | f(x): " + res + " | Quantisiert: " + (int) res); //Ausgabe aller Werte
        }
    }
}
