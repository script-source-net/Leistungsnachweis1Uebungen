import Prog1Tools.IOTools;
public class Tageskalender {
    public static void main(String[] args) {
        String[] stunden = new String[24];      // Array für Stunden Ausgabe mit 24 stellen des Typs String erstellen
        String[] tasks = new String[24];        // Array für tasks mit 24 stellen des Typs String erstellen

        // Array für Stunden mit Daten befüllen
        for(int i = 0; i < stunden.length; i++){
            String hourStart = (i < 10) ? "0" + i + ":00" : ""+ i + ":00";
            String hourEnd = ((i+1) < 10) ? "0" + (i+1) + ":00" : ""+ (i+1) + ":00";
            stunden[i] = hourStart + " - " + hourEnd;
        }

//        for(String h : stunden){
//            System.out.println(h);
//        }

        Boolean add = true;
        while(add) {
            // Interaktionen beginnen
            int eventStart = IOTools.readInt("Startzeit (h)? ");
            String taskDesc = IOTools.readLine("Was ist dann (Text)? ");

            tasks[eventStart] = taskDesc;

            Boolean showcal = IOTools.readBoolean("Tageskalender anzeigen (true|false)? ");
            if(showcal) {
                for(int i = 0; i < stunden.length; i++){
                    System.out.println(stunden[i] + " | " + tasks[i]);
                }
            }
            add = IOTools.readBoolean("Weiteren Termin erfassen (true|false)? ");
            // Bist du sciher request
            if(!add){
                // Negativiert aufgrund der fragenstellung (ich gebe false ein wenn ich weitermachen möchte)
                add = !IOTools.readBoolean("Bist du sicher das du das Programm beenden möchtest? Dein Kalender wird dir anschliessend angezeigt. (true|false) ");
            }
        }

        // Kalender wird abschliessend angezeigt:
        System.out.println("");
        System.out.println("############################### Dein Kalender ###############################");
        System.out.println("");
        for(int i = 0; i < stunden.length; i++){
            System.out.println(stunden[i] + " | " + tasks[i]);
        }
        System.out.println("");
        System.out.println("############################################################################");
        System.out.println("");

    }
}
