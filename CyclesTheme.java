public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do{
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
        int min = 0;
        int max = 0;
        if(num1 > num2 && num1 > num3) {
            max = num1;
        } else if(num2 > num1 && num2 > num3) {
            max = num2;
        } else if(num3 > num1 && num3 > num2) {
            max = num3;
        }
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if(num2 < num1 && num2 < num3) {
            min = num2;
        } else if(num3 < num1 && num3 < num2) {
            min = num3;
        }
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sum = 0;
        int reverseNum4 = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while(num4 > 0) {
            sum += num4 % 10;
            reverseNum4 = num4 % 10;
            num4 /= 10;
            System.out.print(reverseNum4);
        }
        System.out.println(", cумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int num5 = 1;
        int num6 = 24;
        int count = 1;
        for(int i = 1; i < num6; i += 2) {
            if(count > 4) {
                System.out.printf("%3d%n", i);
                count = 1;
            } else {
                System.out.printf("%3d", i);
                count++;
                }
            }
        if(count <= 6) {
            for(int i = count; i < 6; i++) {
            System.out.printf("%3d", 0);
            }
        }
        System.out.println(" ");

        System.out.println("\n5. Проверка количества единиц на четность");
        int num7 = 3141591;
        int countOnes = 0;
        int i = num7;
        while(i > 0) {
            int digit = i % 10;
            if(digit == 1) {
                countOnes++;
            }
            i /= 10;
        }
        System.out.print("Число " + num7 +" содержит " + countOnes +" единиц(ы), ");
        if(countOnes % 2 ==0) {
            System.out.println("это количество четное");
        } else {
            System.out.println("это количество нечетное");
        }


        System.out.println("\n6. Отображение фигур в консоли");
        char asterisk = '*';
        char sharp = '#';
        char dollar = '$';

        for(i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("" + asterisk);
            }
            System.out.print("\n");
        }

        i = 0;
        int j = 0;
        int num8 = 5;
        while(i < 5) {
            while(j < num8){
                System.out.print("" + sharp);
                j++;
            }
            num8 -= 1;
            System.out.print("\n");
            i++;
            j = 0;
        }

        i = 0;
        j = 0;
        int num9 = 1;
        do{
            do{
                System.out.print(dollar);
                j++;
            } while(j < num9);
            num9++;
            System.out.print("\n");
            i++;
            j = 0;
        } while (i < 3);
        i = 0;
        j = 0;
        num9 = 2;
        do{
            do{
                System.out.print(dollar);
                j++;
            } while(j < num9);
            System.out.print("\n");
            num9 -= 1;
            i++;
            j = 0;
        }while(i < 2);

        System.out.println("\n7. Отображение ASCII-символов");
        for(char k = 1; k < 48; k += 2) {
            System.out.printf("%3d %c\n",(int) k , k);
        }
        for(char k = 98; k < 123; k += 2) {
            System.out.printf("%3d %c\n",(int) k , k);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num10 = 1234321;
        int rev = 0;
        int isNum10Pal = num10;
        while (isNum10Pal != 0) {
            rev *= 10;
            rev += isNum10Pal % 10;
            isNum10Pal /= 10;
        }
        if(num10 == rev) {
            System.out.println("Число " + num10 + " является палиндромом");
        } else {
            System.out.println("Число " + num10 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num11 = 125216;
        int startSum = 0;
        int endSum = 0;
        int tmpStart = num11 / 1000;
        int tmpEnd = num11 % 1000;
        int tmp = 0;
        System.out.print("Сумма цифр ");
        while(tmpStart != 0) {
            tmp = tmpStart % 10;
            System.out.print(tmp + " ");
            startSum += tmp;
            tmpStart /= 10;
        }
        System.out.println("= " + startSum);
        System.out.print("Сумма цифр ");
        while(tmpEnd != 0) {
            tmp = tmpEnd % 10;
            System.out.print(tmp + " ");
            endSum += tmp;
            tmpEnd /= 10;
        }
        System.out.println("= " + endSum);
        if(startSum == endSum) {
            System.out.println("Число " + num11 + " является счастливым");
        } else {
            System.out.println("Число " + num11 + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int a = 2;
        int b = 2;
        int mult = 0;
        char vertLine = '|';
        char horLine = '_';
        System.out.print("   " + vertLine);
        int k = 0;
        for(b = 2; b < 10; b++) {
            System.out.printf("%3d", b);
            k++;
        }
        System.out.println("");
        System.out.println("---+------------------------");
        for(a = 2; a < 10; a++) {
            System.out.printf("%2d%2c", a, vertLine);
            for(b = 2; b < 10; b++) {
                mult = a * b;
                System.out.printf("%3d", mult);
            }
            System.out.println("");
        }
    }
}