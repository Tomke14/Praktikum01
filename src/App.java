public class App {
    
    public static void main(String[] args) throws Exception {
        
        //Dozierender
        Dozierender miller = new Dozierender("Miller", "I",23);
        miller.feedback();
        miller.feedback();
        miller.printFeedback(miller.getFeedbackArray());

        String[] tasks = {"Task 1", "Task 2", "Task 3"};
        Praktikumsstunde p1 = new Praktikumsstunde("Statistik", "17.04.2024", "10:30", "G115", tasks);
       p1.printPraktikumsstunde();
       
       //Vorlesungsstunde
        Vorlesungsstunde softwareentwicklung2 = new Vorlesungsstunde("Java", "17.04.2024", "10:30", "G115");

        //Studierender
        Studierender max = new Studierender("Max", 12345, "Informatik");
        Studierender moritz = new Studierender("Lisa", 12346, "Informatik");
        max.frageStellen(miller);
        System.out.println(miller.frageBeantworten());
        max.sprechstundenAnfrage(miller, "17.04.2024");
        System.out.println(miller.terminBestatigen());

    }
}
