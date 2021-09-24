public class Person {
    public String vorname;
    public String nachname;
    public int jahrgang;

    private String wohnort;

    public void setWohnort(String ort){
        this.wohnort = ort;
    }
    public String getWohnort(){
        return this.wohnort;
    }

    public void printMe(){
        System.out.println("Hallo Welt");
    }

    @Override
    public String toString(){
        return vorname + " " + nachname + ", " + jahrgang;
    }
}
