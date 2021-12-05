public class Wolf {
   
    Wolf wolf;
    public static String gender;
    public static String name;
    public static int weight;
    public static int age;
    public static String color;
    
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
