import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Введите первое число");
        int num1 = (int) scan.NextInt();
        System.out.println("Введите знак математической операции");
        char sign = scan.NextLine();
        System.out.println("Введите второе число");
        int num2 = (int) scan.NextInt();

        System.out.println(num1 + " " + sign +" " + num2 + " = " + calc.calculation(num1, num2, sign));

    }
}