import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "no";
        do {
        
            Calculator calc = new Calculator();
            Scanner scan = new Scanner(System.in);
      
            System.out.println("Enter number 1");
            calc.setNum1(scan.nextInt());
      
            System.out.print("Enter an operator (+, -, *, /): ");
            calc.setSign(scan.next().charAt(0));
      
            System.out.println("Enter number 2");
            calc.setNum2(scan.nextInt());
      
            System.out.println(calc.calculate());
      
        do {
            System.out.println("Do you want to continue? [yes/no]:" );
            answer = scan.next();
        } while (!answer.equals("no") && !answer.equals("yes"));  
        } while (answer.equals("yes")); 
    }
}
