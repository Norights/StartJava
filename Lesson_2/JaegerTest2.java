public class JaegerTest2 {
    public static void main(String[] args) {
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
