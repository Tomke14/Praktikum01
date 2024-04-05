import java.util.Scanner;

public class Dozierender {

    //cooli huhu
    private String name;
    private String fakultaet;
    private int bureonummer;
    private int[] feedbackArray = new int[10];

    public String frageBeantworten (String frage) {
        String antwort = "";
        return antwort;
    }

    public static void main(String[] args) {
    Dozierender Miller = new Dozierender("Miller", "I",23);
    Miller.feedback();
    //for (int i=0; i< feedbackArray.length; i++){
    }
 
    int anzahlstudis = 0; 
    public void feedback () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guten Tag liebe Studierende, ich möchte Sie um Ihr Feedback bitten. Wie würden Sie meine Vorlseung in einer Skala von 1-10 bewerten (wobei 1 sehr schlecht und 10 sehr gut wäre)");              
        int feedback = scanner.nextInt();
        anzahlstudis++; 
        feedbackArray[anzahlstudis]=feedback;
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
    
    }
    

