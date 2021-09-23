public class Person {
    public String vorname;
    public String nachname;
    public int jahrgang;

    public void printMe(){
        System.out.println("Hallo Welt");
    }

    @Override
    public String toString(){
        return vorname + " " + nachname + ", " + jahrgang;
    }
}
