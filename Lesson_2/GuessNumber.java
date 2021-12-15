import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        Random rnd = new Random();
        int secretNum = rnd.nextInt(100 + 1);
        Scanner console = new Scanner(System.in);

        while(true) {
            System.out.println(pl1.getName() + ", enter number: ");
            int num = console.nextInt();
            if(num == secretNum) {
                System.out.println("The winner is: " + pl1.getName());
                break;
            } else if(num > secretNum) {
                System.out.println("The entered number is greater than the hidden one");
            } else {
                System.out.println("The entered number is less than the hidden one");
            }

            System.out.println(pl2.getName() + ", enter number: ");
            num = console.nextInt();
            if(num == secretNum) {
                System.out.println("The winner is: " + pl2.getName());
                break;
            } else if(num > secretNum) {
                System.out.println("The entered number is greater than the hidden one");
            } else {
                System.out.println("The entered number is less than the hidden one");
            }
        }
    }
}

