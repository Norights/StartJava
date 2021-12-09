public class Calculator {
    private int num1;
    private int num2;
    private int answer;
    private char sign;

    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getAnswer() {
        return answer;
    }
    
    public void setAnswer(int answer) {
        this.answer = answer;
    }
    
    public char getSign() {
        return sign;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    int calculate() {
        switch(sign) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
            case '^': {
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result = result * num1;
                    answer = result;
                }
            }
        }
        return answer;
    }
}


