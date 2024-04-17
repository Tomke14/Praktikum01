
import java.util.Scanner;  // Import the Scanner class

public class Studierender {
    
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public static void main(String[] args) throws Exception {
        
        Studierender Studi1 = new Studierender("Tomke", 1234, "UXD");
        Studi1.frageStellen(null);
        
    }

    
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    public void frageStellen(Dozierender dozierender) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Stellen Sie Ihre Frage an den Adozierenden: ");
        String frage = myScanner.nextLine();
        dozierender.beantworten(frage);
    }
    // public String frageStellen(){

    //     Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
    //     System.out.print("Stellen Sie ihre Frage: ");

    //     String frage = myScanner.nextLine();  // Read user input
    //     System.out.println("Ihre Frage lautet: " + frage);  // Output user input
        
    //     return frage;
    // }

    public void sprechstundenanfrage(Dozierender dozierender, String termin) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Vereinbaren Sie einen Termin mit dem Dozierenden: ");
        termin = myScanner.nextLine();
        dozierender.terminBestaetigen(termin);
    }
    // public String sprechstundenanfrage(){

    //     Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
    //     String anfrage = myScanner.nextLine();  // Read user input
    //     return anfrage;

    // }

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
