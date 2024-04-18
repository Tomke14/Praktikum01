import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private String dozierende;
    private List<Studierender> studierende;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;

    // Constructor
    public Lehrveranstaltung(String titel, String dozierende, List<Studierender>  studierende, List<Vorlesungsstunde> vorlesungsstunden, List<Praktikumsstunde> praktikumsstunden) {
        this.titel = titel;
        this.dozierende = dozierende;
        this.studierende = studierende;
        this.vorlesungsstunden = vorlesungsstunden;
        this.praktikumsstunden = praktikumsstunden;
    }


    public void addStudierende(Studierender studierende) {
        this.studierende.add(studierende);
    }

    public void removeStudierende(Studierender studierende) {
        studierende.remove(studierende);
    }

   public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        this.praktikumsstunden.add(praktikumsstunde);
    }

    public void removePraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        praktikumsstunden.remove(praktikumsstunde);
    }

    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        this.vorlesungsstunden.add(vorlesungsstunde);
    }

    public void removeVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        vorlesungsstunden.remove(vorlesungsstunde);
    }

    public void showLectureDetails() {
        System.out.println("Lehrveranstaltung:");
        System.out.println("Titel: " + titel);
        System.out.println("Dozierender: " + dozierende);
        System.out.println("Vorlesungsstunden: " + vorlesungsstunden);
        System.out.println("Praktikumsstunden: " + praktikumsstunden);
        System.out.println();
    }

    // Getters and setters
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDozierende() {
        return dozierende;
    }

    public void setDozierende(String dozierende) {
        this.dozierende = dozierende;
    }

    public List<Studierender> getStudierende() {
        return studierende;
    }

    public void setStudierende(List<Studierender> studierende) {
        this.studierende = studierende;
    }

    public List<Vorlesungsstunde> getVorlesungsstunden() {
        return vorlesungsstunden;
    }

    public void setVorlesungsstunden(List<Vorlesungsstunde> vorlesungsstunden) {
        this.vorlesungsstunden = vorlesungsstunden;
    }

    public List<Praktikumsstunde> getPraktikumsstunden() {
        return praktikumsstunden;
    }

    public void setPraktikumsstunden(List<Praktikumsstunde> praktikumsstunden) {
        this.praktikumsstunden = praktikumsstunden;
    }


    public void printLehrveranstaltung() {
        System.out.println("Lehrveranstaltung");
        System.out.println("Titel: " + titel);
        System.out.println("Studierende: " + studierende);
        System.out.println("Vorlesungsstunden: " + vorlesungsstunden);
        System.out.println("Praktikumsstunden: " + praktikumsstunden);
        System.out.println();
    }
}