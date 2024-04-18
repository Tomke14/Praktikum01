import java.util.Scanner;

public class Dozierender {

    private String name;
    private String fakultaet;
    private int bureonummer;
    private static int[] feedbackArray = new int[10];

    // anzahlstudis: anzahl der studenten, die Feedbak gegeben haben
    int anzahlstudis = 0; 
    public void feedback () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guten Tag liebe Studierende, ich möchte Sie um Ihr Feedback bitten. Wie würden Sie meine Vorlesung auf einer Skala von 1-10 bewerten (wobei 1 sehr schlecht und 10 sehr gut wäre)?");              
        int feedback = scanner.nextInt();
        feedbackArray[anzahlstudis]=feedback;
        anzahlstudis++;
    }
    
    public void printFeedback (int[]feedbackArray){
        System.out.println("Feedback der Studierenden:");
        for (int i=0; i<anzahlstudis; i++){
            System.out.println(feedbackArray[i]);
        }
        System.out.println();
    }

    public String frageBeantworten () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihre Antwort ein:");
        String antwort = scanner.nextLine();
        return antwort;
    }
    
    public String terminBestatigen () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie den Termin bestätigen? (Ja/Nein)");
        String antwort = scanner.nextLine();
        if (antwort.equalsIgnoreCase("Ja")) {
            System.out.println("Termin wurde bestätigt.");
            // Hier können Sie den Termin speichern oder weitere Aktionen durchführen
        } else {
            System.out.println("Termin wurde nicht bestätigt.");
        }
        return antwort;
    }
    
    //Konstruktor  
    public Dozierender(String name, String fakultaet, int bureonummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bureonummer = bureonummer;
    }

    //getter und setter  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFakultaet() {
        return fakultaet;
    }
    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }
    public int getBureonummer() {
        return bureonummer;
    }
    public void setBureonummer(int bureonummer) {
        this.bureonummer = bureonummer;
    }
    public int[] getFeedbackArray() {
    return feedbackArray;
    }

    public void setFeedbackArray(int[] feedbackArray) {
    this.feedbackArray = feedbackArray;
}

    
    }
    

