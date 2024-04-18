public class Praktikumsstunde {
    private String thema; 
    private String datum;
    private String uhrzeit;
    private String raum;
    private String[] aufgaben;

    public void printPraktikumsstunde() {
        System.out.println("Praktikumsstunde:");
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
        System.out.println("Aufgaben:");
        for (String aufgabe : aufgaben) {
            System.out.println("- " + aufgabe);
        }
    }

    //Konstruktor
    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String[] aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }
    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public String[] getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(String[] aufgaben) {
        this.aufgaben = aufgaben;
    }
}
