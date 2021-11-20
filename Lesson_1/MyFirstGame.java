public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = 56;
        int playerNumber = 78;
        while (playerNumber < randomNumber) {
            playerNumber++;
            System.out.println("Random number is more than you entered"); 
        }
        while (playerNumber > randomNumber) {
            playerNumber--;
            System.out.println("Random number is less than you entered");
        }
        System.out.println("You win!");
    }
}
