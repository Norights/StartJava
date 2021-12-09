public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegert1 = new Jaeger();
        jaegert1.setName("Gipsy Danger");
        jaegert1.setMark("Mark 3");
        jaegert1.setHeight(260);
        jaegert1.setWeight(1.980f);
        jaegert1.setSpeed(7);
        jaegert1.setStrength(8);
    
        System.out.println("Jaeger name = " + jaegert1.getName());
        System.out.println("Jaeger mark = " + jaegert1.getMark());
        System.out.println("Jaeger height = " + jaegert1.getHeight());
        System.out.println("Jaeger weight = " + jaegert1.getWeight());
        System.out.println("Jaeger speed = " + jaegert1.getSpeed());
        System.out.println("Jaeger Streighth = " + jaegert1.getStrength());

        Jaeger jaegert2 = new Jaeger();
        jaegert2.setName("Cherno Alpha");
        jaegert2.setMark("Mark 1");
        jaegert2.setHeight(280);
        jaegert2.setWeight(2.312f);
        jaegert2.setSpeed(3);
        jaegert2.setStrength(10);
    
        System.out.println("Jaeger name = " + jaegert2.getName());
        System.out.println("Jaeger mark = " + jaegert2.getMark());
        System.out.println("Jaeger height = " + jaegert2.getHeight());
        System.out.println("Jaeger weight = " + jaegert2.getWeight());
        System.out.println("Jaeger speed = " + jaegert2.getSpeed());
        System.out.println("Jaeger Streighth = " + jaegert2.getStrength());
    }
}
