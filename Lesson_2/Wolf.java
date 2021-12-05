public class Wolf {

    public String gender;
    public String name;
    public int weight;
    public int age;
    public String color;
    
    boolean walk() {
        System.out.println("Wolf can walk");
        return true;
    }
    
    boolean sit() {
        System.out.println("Wolf can sit");
        return true;
    }
    
    String run() {
        return "Wolf can run";
    }
    
    String howl() {
        return "Wolf can howl";
    }
    
    String hunt() {
        return "Wolf can hunt";
    }
}
