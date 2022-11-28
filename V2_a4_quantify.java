public class V2_a4_quantify {

    public static void main(String[] args) {

        abtast(0.1, 2, 4 ); //werte in abtast methode schicken
    }
    private static double funktion(double x) //f(x) methode
    {
        double y =  20 * (x * x) - 100 * x + 129.5; 
        return y; 
    }

    private static void abtast(double rate, double start, double end) //abtast methode
    {
        double n;
        double result; 
        int quantized; 

        for(int i = 0; i < (int) (10*(end - start)+1); i++ ){ //abtast-schritte von start bis ende 

            n = (double) i; //cast i zu double; i wert in n speichern
            result = funktion(start + (n * rate)); //start und rate in f(x) methode verrechnen
            quantized = (int) result; //cast ergebnis zu int; in quantized speichern
            
            /* Ausgabe einzelner Abtastschritte */
            System.out.println("x-Wert: "+ (start+(n*rate)) +  "    |   Funktionswert f(X): " + result + "  |   Quantisiert: " + quantized + "  |");
            
            /* Ausgabe Minimum */
            if ((start + (n * rate)) == 2.5){
                System.out.println("------------");
               System.out.println("Minimum!");
               System.out.println("------------");
            }                
        }      
    }   
}
