
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Male";
        wolfOne.name = "Hardy";
        wolfOne.weight = 32;
        wolfOne.age = 3;
        wolfOne.color = "Gray";

        System.out.println("Wolf gender = " + wolfOne.gender);
        System.out.println("Wolf name = " + wolfOne.name);
        System.out.println("Wolf weight = " + wolfOne.weight);
        System.out.println("Wolf age = " + wolfOne.age);
        System.out.println("Wolf color = " + wolfOne.color);

        System.out.println(wolfOne.walk());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}
