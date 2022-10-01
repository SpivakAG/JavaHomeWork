public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter ++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven +
                " , а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        if(num2 < min) {
            min = num2;
        }
        if(num3 < min) {
            min = num3;
        }

        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while(num4 > 0) {
            int digit = num4 % 10;
            sum += digit;
            num4 /= 10;
            System.out.print(digit);
        }
        System.out.println(", cумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 1;
        for(int i = 1; i < 24; i += 2) {
            if(count == 6) {
                System.out.println();
                count = 1;
            }
            System.out.printf("%3d", i);
            count++;
            }
        if(count <= 6) {
            for(int i = count; i < 6; i++) {
                System.out.printf("%3d", 0);
            }
        }
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        int num7 = 3141591;
        int countOnes = 0;
        int copyNum7 = num7;
        while(copyNum7 > 0) {
            int digit = copyNum7 % 10;
            if(digit == 1) {
                countOnes++;
            }
            copyNum7 /= 10;
        }
        System.out.print("Число " + num7 +" содержит " + countOnes +" единиц(ы), ");
        if(countOnes % 2 == 0) {
            System.out.println("это количество четное");
        } else {
            System.out.println("это количество нечетное");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("" + '*');
            }
            System.out.println();
        }

        int h = 0;
        int j = 0;
        int num8 = 5;
        while(h < 5) {
            while(j < num8) {
                System.out.print("" + '#');
                j++;
            }
            num8 -= 1;
            System.out.println();
            h++;
            j = 0;
        }

        h = 0;
        j = 0;
        int num9 = 1;
        do {
            do {
                System.out.print('$');
                j++;
            } while(j < num9);
            num9++;
            System.out.println();
            h++;
            j = 0;
        } while (h < 3);
        h = 0;
        j = 0;
        num9 = 2;
        do {
            do {
                System.out.print('$');
                j++;
            } while(j < num9);
            System.out.println();
            num9 -= 1;
            h++;
            j = 0;
        }while(h < 2);

        System.out.println("\n7. Отображение ASCII-символов");
        for(int i = 1; i < 48; i += 2) {
            System.out.printf("%3d %c\n",(int) i , i);
        }
        for(int i = 98; i < 123; i += 2) {
            System.out.printf("%3d %c\n",(int) i , i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num10 = 1234321;
        int reverse = 0;
        int copyNum10 = num10;
        while (copyNum10 != 0) {
            reverse = (reverse * 10) + copyNum10 % 10;
            copyNum10 /= 10;
        }
        if(num10 == reverse) {
            System.out.println("Число " + num10 + " является палиндромом");
        } else {
            System.out.println("Число " + num10 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num11 = 125216;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int firstHalfNum = num11 / 1000;
        int secondHalfNum = num11 % 1000;
        int tmp = 0;
        System.out.print("Сумма цифр ");
        while(firstHalfNum != 0) {
            tmp = firstHalfNum % 10;
            System.out.print(tmp + " ");
            firstHalfSum += tmp;
            firstHalfNum /= 10;
        }
        System.out.println("= " + firstHalfSum);
        System.out.print("Сумма цифр ");
        while(secondHalfNum != 0) {
            tmp = secondHalfNum % 10;
            System.out.print(tmp + " ");
            secondHalfSum += tmp;
            secondHalfNum /= 10;
        }
        System.out.println("= " + secondHalfSum);
        if(firstHalfSum == secondHalfSum) {
            System.out.println("Число " + num11 + " является счастливым");
        } else {
            System.out.println("Число " + num11 + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int mult = 0;
        System.out.print("   " + '|');
        int k = 0;
        for(int b = 2; b < 10; b++) {
            System.out.printf("%3d", b);
            k++;
        }
        System.out.println();
        System.out.println("---+------------------------");
        for(int a = 2; a < 10; a++) {
            System.out.printf("%2d%2c", a, '|');
            for(int b = 2; b < 10; b++) {
                mult = a * b;
                System.out.printf("%3d", mult);
            }
            System.out.println();
        }
    }
}