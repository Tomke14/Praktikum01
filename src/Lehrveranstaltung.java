import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private String dozierende;
    private List<Studierender> studierende;
    private int vorlesungsstunden;
    private int praktikumsstunden;

    // Constructor
    public Lehrveranstaltung(String titel, String dozierende, List<Studierender>  studierende, int vorlesungsstunden, int praktikumsstunden) {
        this.titel = titel;
        this.dozierende = dozierende;
        this.studierende = studierende;
        this.vorlesungsstunden = vorlesungsstunden;
        this.praktikumsstunden = praktikumsstunden;
    }


    public void addStudierende(Studierender studierende) {
        this.studierende.add(studierende);
    }

    public void removeStudierende(String studierendeName) {
        studierende.remove(studierendeName);
    }

    public void addVorlesungsstunde() {
        vorlesungsstunden++;
    }

    public void deleteVorlesungsstunde() {
        if (vorlesungsstunden > 0) {
            vorlesungsstunden--;
        }
    }

    public void addPraktikumsstunde() {
        praktikumsstunden++;
    }

    public void deletePraktikumsstunde() {
        if (praktikumsstunden > 0) {
            praktikumsstunden--;
        }
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

    public int getVorlesungsstunden() {
        return vorlesungsstunden;
    }

    public void setVorlesungsstunden(int vorlesungsstunden) {
        this.vorlesungsstunden = vorlesungsstunden;
    }

    public int getPraktikumsstunden() {
        return praktikumsstunden;
    }

    public void setPraktikumsstunden(int praktikumsstunden) {
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