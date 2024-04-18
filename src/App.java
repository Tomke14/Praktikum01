import java.util.Arrays;
import java.util.List;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        //Dozierender
        Dozierender miller = new Dozierender("Miller", "I",23);
        miller.feedback();
        miller.feedback();
        miller.printFeedback(miller.getFeedbackArray());


        //Praktikumsstunde
        String[] uebungsaufgaben = {"Übungsblatt 1", "Übungsblatt 2", "Übungsblatt 3"};
      
        Praktikumsstunde praktikumsstundeSWE = new Praktikumsstunde("Softwareentwicklung", "17.04.2024", "10:30", "G115", uebungsaufgaben);
        praktikumsstundeSWE.printPraktikumsstunde();

        //Lehrveranstaltung
        String[] studierende = {"Max", "Moritz", "Erika"};
        List<String> studierendeList = Arrays.asList(studierende);
        Lehrveranstaltung softwareentwicklung2LF = new Lehrveranstaltung("Softwareentwicklung 2", "Prof. Meier", studierende, 2, 2);
        softwareentwicklung2LF.printLehrveranstaltung();

       
       //Vorlesungsstunde
        Vorlesungsstunde softwareentwicklung2 = new Vorlesungsstunde("Java", "17.04.2024", "10:30", "G115");
        softwareentwicklung2.displayDetails();

        //Studierender
        Studierender max = new Studierender("Max", 12345, "Informatik");
        Studierender moritz = new Studierender("Lisa", 12346, "Informatik");
        max.frageStellen(miller);
        System.out.println(miller.frageBeantworten());
        max.sprechstundenAnfrage(miller, "17.04.2024");
        System.out.println(miller.terminBestatigen());

    }
}
