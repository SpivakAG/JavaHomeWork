public class Calculator {
    public double calculation(int num1, int num2, char sign){
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
                result = (num1 * num2) / 100;
                break;
            default:
                System.out.println("Знак нераспознан");
        }
        return result;
    }
}