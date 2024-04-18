import java.util.Arrays;
import java.util.List;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        //Dozierender
        Dozierender Miller = new Dozierender("Miller", "I",23);
        Miller.feedback();
        Miller.feedback();
        Miller.printFeedback(Miller.getFeedbackArray());


        //Praktikumsstunde
        String[] uebungsaufgaben = {"Übungsblatt 1", "Übungsblatt 2", "Übungsblatt 3"};
        
        Praktikumsstunde praktikumsstundeStatistik = new Praktikumsstunde("Statistik", "17.04.2024", "10:30", "G115", uebungsaufgaben);
        praktikumsstundeStatistik.printPraktikumsstunde();

        //Lehrveranstaltung
        String[] studierende = {"Max", "Moritz", "Erika"};
        List<String> studierendeList = Arrays.asList(studierende);
        Lehrveranstaltung softwareentwicklung2 = new Lehrveranstaltung("Softwareentwicklung 2", "Prof. Meier", studierende, 2, 2);
        softwareentwicklung2.printLehrveranstaltung();

        
        
    }
}
