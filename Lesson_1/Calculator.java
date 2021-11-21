public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        String arifmeticheskoeDeistvie = "^";
        
        if (arifmeticheskoeDeistvie == "+") {
            System.out.println(a + b);
        } else if (arifmeticheskoeDeistvie == "-") {
            System.out.println(a - b); 
        } else if (arifmeticheskoeDeistvie == "*") {
            System.out.println(a * b);
        } else if (arifmeticheskoeDeistvie == "/") {
            System.out.println(a / b); 
        } else if (arifmeticheskoeDeistvie == "^") {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
                    System.out.println ("a to the power of b is equal = " + result);
        }
        } else if (arifmeticheskoeDeistvie == "%") { 
            System.out.println(a % b); 
        }
    }
}
