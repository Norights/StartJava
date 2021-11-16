public class Cycle {

    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.print(" " +  i);
        }
        System.out.println(" ");

        int k = 6;
        while(k >= -6) { 
            System.out.println(k);
            k -= 2;
        }

        int x = 10;
        int sum = 0;
        do {
            if(x % 2 == 1) {
                sum += x;
            }
            x++;
        } while(x < 20);
        System.out.println("The sum of the odd numbers from 10 to 20: " + sum);
    }
}
