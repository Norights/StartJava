public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        String sign = "^";
        
        if (sign == "+") {
            System.out.println(a + b);
        } else if (sign == "-") {
            System.out.println(a - b);
        } else if (sign == "*") {
            System.out.println(a * b);
        } else if (sign == "/") {
            System.out.println(a / b);
        } else if (sign == "^") {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
        }
        System.out.println ("a to the power of b is equal = " + result);
        } else if (sign == "%") {
            System.out.println(a % b);
        }
        
    }
}
