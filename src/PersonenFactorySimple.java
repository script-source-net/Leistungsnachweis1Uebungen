import Prog1Tools.IOTools;

class MyPerson {
    String vorname;
    String nachname;
    String position;
}

public class PersonenFactorySimple {
    public static void main(String[] args) {
        int anzahlP = IOTools.readInt("Wie viele Personen? ");
        MyPerson[] personen = new MyPerson[anzahlP];
        int pointer = 0;
        Boolean edit = true;
        while(edit){
            showmenu();
            int selection = IOTools.readInt("Deine Auswahl: ");
            switch (selection){
                case 0:
                    pointer = IOTools.readInt("An welcher Stelle soll ein Eintrag gemacht / überschrieben werden (1-"+anzahlP+")? ") - 1;
                    System.out.println(pointer);
                    MyPerson p = new MyPerson();
                    String input = IOTools.readLine("Angaben zur Person (Format: 'Vorname:Nachname:Position'): ");
                    if(input.contains(":")){
                        String[] inputParts = input.split(":");
                        if(inputParts.length > 0){
                            p.vorname = inputParts[0];
                        }
                        if(inputParts.length > 1){
                            p.nachname = inputParts[1];
                        }
                        if(inputParts.length > 2){
                            p.position = inputParts[2];
                        }
                    }else{
                        // Kein Doppelpunkt ALLES im Vornamen
                        p.vorname = input;
                    }
                    personen[pointer] = p;
                    break;
                case 1:
                    break;
                case 2:
                    // Einträge anzeigen
                    showPersons(personen);
                    break;
                case 3:
                    edit = false;
                    break;
                default:
                    System.out.println("Fehler: Ungültige Auswahl!");
                    System.out.println();
            }
        }

        System.out.println("################## Personen: ##################");
        showPersons(personen);

    }

    static void showmenu(){
        System.out.println("################## Menu ");
        System.out.println("0 = Eintrag hinzufügen");
        System.out.println("1 = Eintrag entfernen");
        System.out.println("2 = Einträge anzeigen");
        System.out.println("3 = Programm beenden");
    }

    static void showPersons(MyPerson[] personen){
        System.out.println();
        System.out.println();
        System.out.println("###########################################");
        System.out.println("###########################################");
        System.out.println("############## Personenliste ##############");
        System.out.println("###########################################");
        System.out.println("###########################################");
        System.out.println();
        int i = 1;
        for(MyPerson p : personen){
            if(p != null) {
                String vorname = p.vorname  != null ? p.vorname  : "";
                String nachname = p.nachname  != null ? p.nachname  : "";
                String position = p.position  != null ? p.position  : "n/A";
                System.out.println("----- Person " + i + " ------");
                System.out.println("Vorname  : " + vorname);
                System.out.println("Nachname : " + nachname);
                System.out.println("Position : " + position);
                System.out.println("---------------------");
                System.out.println();
            }
            i++;
        }
        System.out.println("###########################################");
        System.out.println("###########################################");
    }
}
