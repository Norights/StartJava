public class Wolf {
   
    private String gender;
    private String name;
    private int weight;
    private int age;
    private String color;
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int Weight) {
        this.weight = weight;
    }
    
    public int getAge() {
        if (age > 8) {
            System.out.println("Incorrect age");
        }
        return age;
    }
    
    public void setAge(int Age) {
        this.age = age;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String Color) {
        this.color = color;
    }
    
    public boolean walk() {
        System.out.println("Wolf can walk");
        return true;
    }
    
    public boolean sit() {
        System.out.println("Wolf can sit");
        return true;
    }
    
    public String run() {
        return "Wolf can run";
    }
    
    public String howl() {
        return "Wolf can howl";
    }
    
    public String hunt() {
        return "Wolf can hunt";
    }
}
