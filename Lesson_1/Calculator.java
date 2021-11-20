public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        String c = "^";
        
        if (c == "+") {
            System.out.println(a + b);
        } else if (c == "-") { 
            System.out.println(a - b); 
        } else if (c == "*") { 
            System.out.println(a * b);
        } else if (c == "/") { 
            System.out.println(a / b); 
        } else if (c == "^") {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result = result * a;
                    System.out.println ("a to the power of b is equal = " + result); 
                }
        } else if (c == "%") { 
            System.out.println(a % b); 
        }
    }
}
