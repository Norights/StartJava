public class Cycle {

    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.print(" " +  i);
        }
        System.out.println(" ");

        int counter = 6;
        while(counter >= -6) { 
            System.out.println(counter);
            counter -= 2;
        }

        counter = 10;
        int sumOdd = 0;
        do {
            if(counter % 2 == 1) {
                sumOdd += counter;
            }
            counter++;
        } while(counter < 20);
        System.out.println("The sum of the odd numbers from 10 to 20: " + sumOdd);
    }
}
