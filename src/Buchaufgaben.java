import Prog1Tools.IOTools;
public class Buchaufgaben {
    public static void main(String[] args) {

        /* 3.16 - Seite 101 */
        // Zählt in 2er Schritten von 20 - 0
//        int i = 20;
//        while (i > 0){
//            System.out.println(i);
//            i -= 2;
//        }

//        for (int i = 20; i > 0; i-=2){
//            System.out.println(i);
//            //i =  i - 2;
//        }

        // 3.19
//        // Lese n ein:
//        int n = IOTools.readInt("Zahl für Berechnung (n): ");
//        int i = 3;
//        //while
//        while (i < (2*n)){
//            i++;
//            System.out.println(1.0/(2*i+1));
//        }
//        System.out.println("Fertig while");
//
//        for(i = 3; i < (2*n);){
//            i++;
//            System.out.println(1.0/(2*i+1));
//        }
//        System.out.println("Fertig for");

        // 3.20
//        for(int row = 1; row < 9; row++){
//            String content = "";
//            int start = row;    // same same
//            int end = 9 + row - 1;   //
//            for(int n = start; n < end; n++){
//                String spacer = n < 9 ? "   " : "  ";
//                content += n + spacer;
//            }
//            System.out.println(content);
//        }
        // Zahlenraten
        int geheimzahl = (int) (99 * Math.random() + 1);
        System.out.println("Hallo, Rate die Zahl zwischen 1 & 100");
        int userzahl = 0;
        int versuch = 0;
        Boolean play = true;
        while(userzahl != geheimzahl && play){
            String hint = userzahl < geheimzahl ? "grösser" : "kleiner";
            if(versuch > 0) {
                System.out.println("Versuch #"+versuch);
                System.out.println("Leider falsch, die geheimzahl ist "+hint+" als " + userzahl + " Versuche es nochmals");
            }
            // Jedes 5. mal fragen ob man noch spielen will
            if(versuch != 0 && versuch % 5 == 0) {
                play = IOTools.readBoolean("Willst du noch spielen? ");
            }

            if(play) {
                userzahl = IOTools.readInt("Welche Zahl darfs denn sein? ");
            }
            versuch++;
        }
        System.out.println("Die geheimzahl war: "+geheimzahl);
        System.out.println("wow das waren "+versuch+" Versuche");
        if(versuch < 10){
            System.out.println("Ganz schön beindruckend!");
        }else if(versuch > 10 && versuch < 20){
            System.out.println("ganz schön durchschnittlich");
        }else{
            System.out.println("Richtig schlecht!");
        }
        System.out.println("Danke fürs mitspielen und bis bald!");
    }
}
