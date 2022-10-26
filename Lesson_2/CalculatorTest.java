import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Введите первое число");
        int num1 = (int) scan.nextInt();
        System.out.println("Введите знак математической операции");
        char sign = scan.next().charAt(0);
        System.out.println("Введите второе число");
        int num2 = (int) scan.nextInt();
        System.out.println(num1 + " " + sign +" " + num2 + " = " + calc.calculation(num1, num2, sign));
    }
}