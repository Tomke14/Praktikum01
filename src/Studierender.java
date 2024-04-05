
import java.util.Scanner;  // Import the Scanner class

public class Studierender {
    
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public static void main(String[] args) throws Exception {
        
        Studierender Studi1 = new Studierender("Tomke", 1234, "UXD");
        Studi1.frageStellen();
        
    }

    
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String frageStellen(){

        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Stellen Sie ihre Frage: ");

        String frage = myScanner.nextLine();  // Read user input
        System.out.println("Ihre Frage lautet: " + frage);  // Output user input
        
        return frage;
    }

    public String sprechstundenanfrage(){

        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        String anfrage = myScanner.nextLine();  // Read user input
        return anfrage;

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