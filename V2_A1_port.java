import java.io.*;

public class portNummern {
    public static void main(String[] args) {
        int port = getInt();
        if(port == -1) System.exit(0);
        System.out.print("Port: " + port + ", Typ: ");
        getPortType(port);
        main(null);
    }

    public static int getInt() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("\nPort eingeben: ");
            int port = Integer.parseInt(in.readLine());
            if(port < -1 || port > 65535) throw new IOException("Port außerhalb der Grenzen");
            return port;
        } catch(NumberFormatException | IOException e) {
            System.out.println("Falsche Eingabe");
            return getInt();
        }
    }

    public static void getPortType(int port) {
        if(port <= 1023) {
            System.out.print("well-known Port");
            switch(port) {
                case(21): System.out.print(", Name: FTP"); break;
                case(23): System.out.print(", Name: Telnet"); break;
                case(25): System.out.print(", Name: SMTP"); break;
                case(80): System.out.print(", Name: HTTP"); break;
                case(143): System.out.print(", Name: IMAP"); break;
            }
        }
        else if(port <= 49151) System.out.println("registered Port");
        else if(port <= 65535) System.out.println("dynamic Port");
    }
}