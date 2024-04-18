import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        //Dozierender
        Dozierender miller = new Dozierender("Miller", "I",23);
        miller.feedback();
        miller.feedback();
        miller.printFeedback(miller.getFeedbackArray());

        //Studierender
        List<Studierender> teilnehmerlisteSWE = new ArrayList<>();
        Studierender max = new Studierender("Max", 12345, "Informatik");
        Studierender lisa = new Studierender("Lisa", 12346, "Informatik");
        Studierender john = new Studierender("John", 12347, "Informatik"); // New student
        teilnehmerlisteSWE.add(max);
        teilnehmerlisteSWE.add(lisa);
        teilnehmerlisteSWE.add(john); // Add new student

        //Lehrveranstaltung
        Lehrveranstaltung softwareentwicklung2LF = new Lehrveranstaltung("Softwareentwicklung 2", "Prof. Meier", teilnehmerlisteSWE, 2, 2);
        softwareentwicklung2LF.printLehrveranstaltung();

        //Praktikumsstunde
        String[] uebungsaufgaben = {"Übungsblatt 1", "Übungsblatt 2", "Übungsblatt 3"};
      
        Praktikumsstunde praktikumsstundeSWE = new Praktikumsstunde("Softwareentwicklung", "17.04.2024", "10:30", "G115", uebungsaufgaben);
        praktikumsstundeSWE.printPraktikumsstunde();
       
       //Vorlesungsstunde
        Vorlesungsstunde softwareentwicklung2 = new Vorlesungsstunde("Java", "17.04.2024", "10:30", "G115");
        softwareentwicklung2.displayDetails();

    
        max.frageStellen(miller); // ruft frageBeantworten() von Dozierender auf
        max.sprechstundenAnfrage(miller); // ruft terminBestatigen() von Dozierender auf

        System.out.println("John wird aus der Lehrveranstaltung entfernt:");
        teilnehmerlisteSWE.remove(john); // Remove new student
        softwareentwicklung2LF.printLehrveranstaltung();

    }
}
