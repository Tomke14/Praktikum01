public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] tasks = {"Task 1", "Task 2", "Task 3"};
        
        
        Praktikumsstunde p1 = new Praktikumsstunde("Statistik", "17.04.2024", "10:30", "G115", tasks);
       p1.printPraktikumsstunde();
        
    }
}
