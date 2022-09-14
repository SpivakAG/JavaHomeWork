public class CyclesTheme {
    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int evenSum = 0;
        int oddSum = 0;
        int i = 1;
        do{
            if(num % 2 == 0) {
                evenSum +=  num;
            } else {
                oddSum += num;
            }
            num += i;
        } while(num <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenSum +
                " , а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = 0;
        int max = 0;
        if(num1 > num2 && num1 > num3) {
            max = num1;
        } else if(num2 > num1 && num2 > num3) {
            max = num2;
        } else if(num3 > num1 && num3 > num2) {
            max = num3;
        }
        if(num1 < num2 && num1 < num3) {
            min = num1;
        } else if(num2 < num1 && num2 < num3) {
            min = num2;
        } else if(num3 < num1 && num3 < num2) {
            min = num3;
        }
        for (i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sum = 0;
        int reverseNum4 = 0;
        while(num4 > 0) {
            sum += num4 % 10;
            reverseNum4 *= 10;
            reverseNum4 += num4 % 10;
            num4 /= 10;
        }
        System.out.println("Исходное число в обратном порядке: " + reverseNum4 + ", cумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

    }
}