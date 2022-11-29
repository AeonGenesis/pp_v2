import java.io.*;

public class Gruppe32_V2_A2_caesar {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
        String plain = "";
        int key;
        int choice;

        /* Nutzereingaben */
        /* Key Abfrage & Kontrolle */
        do {
            System.out.println("Bitte geben sie einen Keywert zwischen 1 und 25 ein:");
            key = Integer.parseInt(eingabe.readLine());
        } while (key > 25 || 1 > key);
        
            System.out.println("Text Eingabe: ");
            plain = new String(eingabe.readLine());
            System.out.println("Gespeicherter Text: " + plain);

         /* Methoden Abfrage & Kontrolle */
        do {
            System.out.println("Möchten Sie ihre Eingabe verschluesseln oder entschluesseln?");
            System.out.println("1 - verschluesseln");
            System.out.println("2 - entschluesseln");
            choice = Integer.parseInt(eingabe.readLine());
        } while (choice < 1 || choice >= 3);

        /* Eingaben in Methoden schicken und verrechnen */
        String cipher = code(plain, key); //Verschluesselung Methode
        String decoded = decode(plain, key); //Entschluesselung Methode


        /* Ausgabe Resultat */
        switch(choice) {
            case 1: System.out.println("Eingabe: " + plain); 
            System.out.println("Verschluesselt mit dem Key " + key);
            System.out.println(cipher);
            break;

            case 2: System.out.println("Verschlüsselte Eingabe: " + plain);
            System.out.println("Entschlüsselt mit dem Key " + key);
            System.out.println(decoded);
            break;

            default: System.out.println("Falsche Eingabe"); break;
        }
                
    }



    /* CODE: Eingabe (plain) verschluesseln */
    public static String code(String plain, int key) {
        String cipher = "";
        for (int i = 0; i < plain.length(); i++) {
            // Buchstaben verschieben und an cipher haengen
            char next = plain.charAt(i);
            cipher = cipher + shift(next, key);
        }
        return cipher;
    }

    /* DECODE: Eingabe(plain) entschluesseln */
    public static String decode(String plain, int key) {
        String decoded = "";
        for (int i = 0; i < plain.length(); i++) {
            // verschiebung um 26 - Key
            char next = plain.charAt(i);
            decoded = decoded + shift(next, 26 - key);
        }
        return decoded;
    }
    
    /* SHIFT: Buchstaben Verschiebung */
    public static char shift(char letter, int shift) {
        if (letter >= 'a' && letter <= 'z') { //kleinbuchstaben
            letter += shift;
            while (letter > 'z') {
                letter -= 26;
            }
        } else if (letter >= 'A' && letter <= 'Z') { //grossbuchstaben
            letter += shift;
            while (letter > 'Z') {
                letter -= 26;
            }
        }
        return letter;
    }

}
