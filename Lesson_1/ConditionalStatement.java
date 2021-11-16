public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("You are young");
        }

        boolean isMan = true;
        if(isMan) {
            System.out.println("You're a man");
        }
        if(!isMan) {
            System.out.println("You're not a man");
        }

        double yourHeight = 1.57;
        if(yourHeight < 1.80) {
            System.out.println("Your height is more than 180 centimeters");
        } else {
            System.out.println("Your height is less than 180 centimeters");
        }

        char firstLetterOfName = 'M';
        if(firstLetterOfName == 'M') {
            System.out.println("Your first letter of name is M");
        } else { 
            System.out.println("Your first letter of name is not M");
        }
    }
}
