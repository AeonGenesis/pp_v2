public class V2_A3_bumm {
    public static void main(String[] args) {
        eineSchleife();
        System.out.println("\n");
        zweiSchleifen();
    }

    public static void eineSchleife() {
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0 && i != 0) System.out.print("bumm "); //Checken ob durch 7 teilbar und nicht 0
            else if ((i-7)%10 == 0) System.out.print("bumm "); //Checken ob Ziffer 7 vorhanden ist
            else System.out.print(i + " ");
        }
    }

    public static void zweiSchleifen() {
        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 10; y++) {
                if(i == 7 || y == 7) System.out.print("bumm "); //Checken ob Ziffer 7 vorhanden ist
                else if((i * 10 + y) % 7 == 0 && i != 0) System.out.print("bumm "); //Checken ob durch 7 teilbar und nicht 0
                else System.out.print(i * 10 + y + " ");
            }
        }
    }
}