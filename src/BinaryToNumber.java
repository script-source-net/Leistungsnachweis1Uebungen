import Prog1Tools.IOTools;

public class BinaryToNumber {
    public static void main(String[] args) {
        int option = 1;
        while (option == 1) {
            String binary = IOTools.readLine("Binäre Nummer eingeben: ");
            String bin_inverted = umkehren(binary);     // Den String umkeheren damit wir durch "loopen" können.
            int i = 0;
            int summe = 0;
            for (char c : bin_inverted.toCharArray()) {
                if (c == '0' || c == '1') {
                    if (c == '1') {
                        summe += Math.pow(2, i);
                    }
                    i++;
                } else {
                    System.out.println("Fehler! " + c + " ist keine Binäre Zahl an Stelle " + i + "!");
                    break;
                }
            }
            System.out.println("Die Binäre Zahl " + binary + " entspricht dem Wert " + summe);

            option = showSelect(option);

            while(option != 1 || option != 0) {
                System.out.println("UNGÜLTIGE AUSWAHL");
                option = showSelect(option);
            }
        }
    }

    public static String umkehren( String str )
    {
        String umgekehrt = new String();

        for ( int j = str.length()-1; j >= 0; j-- )
            umgekehrt += str.charAt(j);

        return umgekehrt;
    }
    public static int showSelect(int option){
        System.out.println("");
        System.out.println("");
        System.out.println("##################");
        System.out.println("Was möchten Sie tun?");
        System.out.println("0 = Programm beenden");
        System.out.println("1 = Neue Binäre Zahl umrechnen");
        option = IOTools.readInt("Auswahl: ");
        return option;
    }
}
