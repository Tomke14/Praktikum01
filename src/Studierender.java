
import java.util.Scanner;  // Import the Scanner class

public class Studierender {
    
    private String name;
    private int matrikelnummer;
    private String studiengang;

    
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    public void frageStellen(Dozierender dozierender) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Stellen Sie Ihre Frage an den Dozierenden: ");
        String frage = myScanner.nextLine();
        dozierender.frageBeantworten();
    }


    public void sprechstundenAnfrage(Dozierender dozierender) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Vereinbaren Sie einen Termin mit dem Dozierenden: ");
        String termin = myScanner.nextLine();
        dozierender.terminBestatigen();
    }

    
    @Override
    public String toString() {
        return '\n' + name + ", " + matrikelnummer + ", " + studiengang + '\n';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
    
    
}
