import Prog1Tools.IOTools;
public class Wochenkalender {
    public static void main(String[] args) {
        String[] hours = new String[24];
        String[] tasks = new String[24];
        String[] days = {"Mo","Di","Mi","Do","Fr","Sa","So"};
        String[][] tasksArray = {new String[24], new String[24], new String[24], new String[24], new String[24], new String[24], new String[24]};



        // Array für Stunden mit Daten befüllen
        for(int i = 0; i < hours.length; i++){
            String hourStart = (i < 10) ? "0" + i + ":00" : ""+ i + ":00";
            String hourEnd = ((i+1) < 10) ? "0" + (i+1) + ":00" : ""+ (i+1) + ":00";
            hours[i] = hourStart + " - " + hourEnd;
        }

        // Add task
//        tasksArray[1][4] = "Mein Tag";
//        System.out.println(tasksArray[1][5]);


        // add item
        Boolean add = true;
        while(add) {
            int dayId = IOTools.readInt("An welchem Tag der Woche soll ein neuer Termin erstellt werden (int)? ");
            int hourId = IOTools.readInt("Zu welcher Stunde soll ein neuer Termin erstellt werden (int)? ");
            String taskDesc = IOTools.readLine("Was passiert dann (String)? ");

            tasksArray[dayId][hourId] = taskDesc;
            System.out.println("Am " + days[dayId] + " wurde um " + hours[hourId] + " Uhr der Task '" +  taskDesc + "' erfasst.");

            add = IOTools.readBoolean("Weitere Termine erfassen?");
        }

        // Print Calendar
        System.out.println("");
        for(int i = 0; i<days.length;i++){
            if(i == 0){
                System.out.print("Uhrzeit        |   ");
            }else{
                System.out.print("|   ");
            }
            System.out.print(days[i] + "   ");
        }

        System.out.println("");

        int i = 0;
        for(String h:hours){
            // Spalte eins Uhrzeit:
            System.out.print(h+"  |");
            // Die Tasks
            for(int d = 0; d < days.length; d++){
                System.out.print("   "+tasksArray[d][i]+"  |");
            }
            //Force newLine
            System.out.println("");
            i++;
        }


    }
}
