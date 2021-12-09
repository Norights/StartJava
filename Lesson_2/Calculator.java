public class Calculator {
    private int num1;
    private int num2;
    private int result;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void setAnswer(int answer) {
        this.result = result;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    int calculate() {
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
                int z = 1;
                for (int i = 1; i <= num2; i++) {
                    result = z * num1;
                }
            }
        return result;
    }
}



