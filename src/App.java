public class App {
    
    public static void main(String[] args) throws Exception {
        
        //Dozierender
        Dozierender Miller = new Dozierender("Miller", "I",23);
        Miller.feedback();
        Miller.feedback();
        Miller.printFeedback(Miller.getFeedbackArray());

        String[] tasks = {"Task 1", "Task 2", "Task 3"};
        
        
        Praktikumsstunde p1 = new Praktikumsstunde("Statistik", "17.04.2024", "10:30", "G115", tasks);
       p1.printPraktikumsstunde();

       Studierender Studi1 = new Studierender("Tomke", 1234, "UXD");
        Studi1.frageStellen(null);
        
    }
}
