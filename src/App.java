import java.util.ArrayList;
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
        Studierender john = new Studierender("John", 12347, "Informatik"); 
        teilnehmerlisteSWE.add(max);
        teilnehmerlisteSWE.add(lisa);
        teilnehmerlisteSWE.add(john); 


        //Praktikumsstunde
        String[] uebungsaufgaben = {"Übungsblatt 1", "Übungsblatt 2", "Übungsblatt 3"};
      
        List<Praktikumsstunde> praktikumsstundenListe = new ArrayList<>();
        Praktikumsstunde praktikumsstundeSWE = new Praktikumsstunde("Softwareentwicklung", "17.04.2024", "10:30", "G115", uebungsaufgaben);
        praktikumsstundenListe.add(praktikumsstundeSWE);
        praktikumsstundeSWE.printPraktikumsstunde();
       
        //Vorlesungsstunde
        List<Vorlesungsstunde> vorlesungsstundenListe = new ArrayList<>();
        Vorlesungsstunde softwareentwicklung2 = new Vorlesungsstunde("Java", "17.04.2024", "10:30", "G115");
        vorlesungsstundenListe.add(softwareentwicklung2);
        softwareentwicklung2.displayDetails();

        //Lehrveranstaltung
        Lehrveranstaltung softwareentwicklung2LF = new Lehrveranstaltung("Softwareentwicklung 2", "Prof. Meier", teilnehmerlisteSWE, vorlesungsstundenListe, praktikumsstundenListe);
        softwareentwicklung2LF.printLehrveranstaltung();

    
        max.frageStellen(miller); // ruft frageBeantworten() von Dozierender auf
        max.sprechstundenAnfrage(miller); // ruft terminBestatigen() von Dozierender auf

        System.out.println("John wird aus der Lehrveranstaltung entfernt:");
        teilnehmerlisteSWE.remove(john); // Remove new student
        System.out.println("Teilnehmerliste:"); // Print updated list
        for (Studierender studierender : teilnehmerlisteSWE) {
            System.out.println(studierender.getName());
        }
    }
}
