public class V2_a4_quantify {

    public static void main(String[] args) {
        abtast(0.1, 2, 4 );
    }
    private static double funktion(double x) 
    {
        double y =  20 * (x * x) - 100 * x + 129.5;
        return y; 
    }

    private static void abtast(double rate, double start, double end)
    {


        double n = 0;
        double result = 0; 
        int quantized = 0; 
        for(int i = 0; i < (int) (10*(end - start)+1); i++ )
        {

            n = (double) i; 
            result = funktion(start + (n * rate));
            quantized = (int) result;
            
            System.out.println("Für den x-Wert: "+ (start+(n*rate)) +  " beträgt der Funktionswert f(X): " + result + ". Quantisiert: " + quantized + ".");
            if ((start + (n * rate)) == 2.5)
                System.out.println("An dieser Stelle befindet sich ein Minimum. ");
            
        }
        
        
    }


    
}
