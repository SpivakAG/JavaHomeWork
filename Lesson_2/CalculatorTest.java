import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "";
        boolean repeat = false;
        boolean wrongAnswer = false;
        do {
            System.out.println("Введите первое число");
            int num1 = scan.nextInt();
            calc.setNum1(num1);
            System.out.println("Введите знак математической операции");;
            char sign = scan.next().charAt(0);
            calc.setSign(sign);
            System.out.println("Введите второе число");
            int num2 = scan.nextInt();
            calc.setNum2(num2);
            System.out.println(num1 + " " + sign +" " + num2 + " = " + calc.calculation());
            do {
                wrongAnswer = false;
                System.out.println("Хотите продолжить ? [yes/no]:");
                scan.nextLine();
                answer = scan.nextLine();
                if(answer != "yes" || answer != "no") {
                    System.out.println("Ответ не распознан, попробуйте еще");
                }
            } while(answer != "yes" || answer != "no");
        } while(repeat);
    }
}