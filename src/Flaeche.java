import Prog1Tools.IOTools;

public class Flaeche {
    public static void main(String[] args) {
        int x = IOTools.readInt("Breite (x)? ");
        int y = IOTools.readInt("Höhe (y)? ");

        System.out.println(flaecheberechnen(x,y));
    }

    static int flaecheberechnen(int x, int y){
        int flaeche = x * y;
        return flaeche;
    }

}
