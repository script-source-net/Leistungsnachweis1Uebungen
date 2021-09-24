import Prog1Tools.IOTools;

public class Personen {
    public static void main(String[] args) {
        Person[] personen = new Person[5];
        Person p1 = new Person();
        p1.vorname = "Alex";
        p1.nachname = "Schmid";
        p1.jahrgang = 1986;
        p1.setWohnort("Mels");

        personen[0] = p1;

        int selection = 1;
        int position = 1;

        while(selection != 0){
            String filled = "";
            int count = 0;
            for(int i = 0; i < personen.length; i++){
                if(personen[i] != null) {
                    count++;
                    if(i>0 && count > 1){
                        filled += ", ";
                    }
                    filled += i;
                }
            }
            String wurde = "wurde";
            String txtPersons = "Person";
            String txtPositions = "der Position";

            if(count > 1){
                wurde = "wurden";
                txtPersons = "Personen";
                txtPositions =  "den Positionen";
            }

            System.out.println();
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Es "+wurde+" "+count+" "+txtPersons+" an "+txtPositions+": " + filled + " eingetragen.");
            System.out.println("---------------------------------------------------------------------");
            System.out.println();

            // Zeige Select Menü an
            selection = menu();

            if(selection == 1) {
                position = IOTools.readInt("An welcher Position möchtest du etwas eintragen? ");
                Person p = new Person();
                p.vorname = IOTools.readLine("Vorname? ");
                p.nachname = IOTools.readLine("Nachname? ");
                p.jahrgang = IOTools.readInt("Jahrgang? ");

                personen[position] = p;

                System.out.println("Person "+p.vorname+" "+p.nachname+" aus "+p.getWohnort()+" auf Index "+position+" hinzugefügt.");
            }
            if(selection == 2){
                position = IOTools.readInt("Welcher Index soll angezeigt werden? ");
                Person p = personen[position];
                System.out.println("Person "+p.vorname+" "+p.nachname+" aus "+p.getWohnort()+" auf Index "+position+" hinzugefügt.");
            }
        }
        System.out.println();
        System.out.println("********* Programm beendet *********");
        System.out.println("Eingetragene Personen:");
        for(Person p : personen){
            if(p != null) {
                System.out.println(p.toString());
            }
        }

        //System.out.println(p1.toString());
    }

    public static int menu(){
        System.out.println();
        System.out.println("############# MENU #############");
        System.out.println("0 = Programm beenden");
        System.out.println("1 = Eintrag hinzufügen / bearbeiten");
        System.out.println("2 = Eintrag anzeigen");
        System.out.println("################################");
        System.out.println();
        int selection = IOTools.readInt("Was möchtest du tun? ");
        return selection;
    }
}
