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
            int num1 = (int) scan.nextInt();
            System.out.println("Введите знак математической операции");;
            char sign = scan.next().charAt(0);
            System.out.println("Введите второе число");
            int num2 = (int) scan.nextInt();
            System.out.println(num1 + " " + sign +" " + num2 + " = " + calc.calculation(num1, num2, sign));
            do {
                wrongAnswer = false;
                System.out.println("Хотите продолжить игру? [yes/no]:");
                scan.nextLine();
                answer = scan.nextLine();
                switch(answer) {
                    case "yes":
                        repeat = true;
                        break;
                    case "no":
                        repeat = false;
                        break;
                    default:
                        System.out.println("Ответ не распознан, попробуйте еще");
                        wrongAnswer = true;
                }
            } while(wrongAnswer);
        } while(repeat);
    }
}