public class Calculator {

    private int num1;
    private int num2;
    private char sign = '%';
    private double result = num1;

    public setNum1(int inputNum){
        num1 = inputNum;
    }
    public setNum2(int inputNum){
        num2 = inputNum;
    }
    public setSign(char sign) {
        this.sign = sign;
    }

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
    System.out.println(num1 + " " + sign +" " + num2 + " = " + result);
}