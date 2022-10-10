public class Calculator {

    public static void main(String[] args) {
        int num1 = 120;
        int num2 = 70;
        char sign = '%';
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
        System.out.println(num1 + " " + sign +" " + num2 + " = " + result);
    }
}