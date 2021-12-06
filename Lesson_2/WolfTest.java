public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Male");
        wolfOne.setName("Hardy");
        wolfOne.setWeight(32);
        wolfOne.setAge(3);
        wolfOne.setColor("Gray");

        System.out.println("Wolf gender = " + wolfOne.getGender());
        System.out.println("Wolf name = " + wolfOne.getName());
        System.out.println("Wolf weight = " + wolfOne.getWeight());
        System.out.println("Wolf age = " + wolfOne.getAge());
        System.out.println("Wolf color = " + wolfOne.getColor());
    
        System.out.println(wolfOne.walk());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}
