public class V2_a4_quantify {




    public static void main(String[] args) {
        abtast(0.1f, 2f, 4f);
    }
    private static float funktion(float x) 
    {
        float y =  20f * (x * x) - 100f * x + 129.5f;
        return y; 
    }

    private static void abtast(float rate, float start, float end)
    {


        float n = 0f;
        float result = 0f; 
        int quantized = 0; 
        for(int i = 0; i < (int) (10*(end - start)+1); i++ )
        {

            n = (float) i; 
            result = funktion(start + (n * rate));
            quantized = (int) result;
            
            System.out.println("Für den x-Wert: "+ (start+(n*rate)) +  " beträgt der Funktionswert f(X): " + result + ". Quantisiert: " + quantized + ".");
            if ((start + (n * rate)) == 2.5f)
                System.out.println("An dieser Stelle befindet sich ein Minimum. ");
            
        }
        
        
    }


    
}
