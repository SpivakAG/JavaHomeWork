public class Calculator {

    private int num1;
    private int num2;
    private char sign = '%';

    public void setNum1(int inputNum){
        num1 = inputNum;
    }
    public void setNum2(int inputNum){
        num2 = inputNum;
    }
    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculation(int num1, int num2, char sign){
        double result = num1;
        if(sign == '+') {
            result += num2;
        } else if(sign == '-') {
            result -= num2;
        } else if(sign == '/') {
            result /= num2;
        } else if(sign == '*') {
            result *= num2;
        } else if(sign == '^') {
            for(int i = 1; i < num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = (num1 * num2) / 100;
        }
        return result;
    }
}