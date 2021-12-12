public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        int result;
        switch(sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= num2; i++) {
                    result = result * num1;
                }
                break;
            default:
                result = 0; 
            }
        return result;
    }
}
