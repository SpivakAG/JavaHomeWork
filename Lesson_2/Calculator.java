public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num) {
        num1 = num;
    }

    public void setNum2(int num) {
        num2 = num;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculation() {
        double result = num1;
        switch(sign) {
            case '+':
                result += num2;
                break;
            case '-':
                result -= num2;
                break;
            case '/':
                result /= num2;
                break;
            case '*':
                result *= num2;
                break;
            case '^':
                for(int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Знак нераспознан");
        }
        return result;
    }
}