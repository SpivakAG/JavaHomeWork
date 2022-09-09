public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        boolean pcOsWin10 = true;
        byte ramGb = 16;
        short numberOfPrograms = 253;
        int ramMb = 16384;
        long hddMb = 1048576;
        char hddLetter = 'C';
        float cpuGhz = 3.20f;
        double hddGB = 1024.0d;
        System.out.println("Операционная система это Win10 ?" + pcOsWin10 + 
                "\nОбъем оперативной памяти в ГБ = " + ramGb + 
                "\nКоличество установленных программ = " + numberOfPrograms + 
                "\nОбъем  оперативной памяти в МБ = " + ramMb + 
                "\nОбъем жесткого диска в МБ = " + hddMb + 
                "\nБуква жесткого диска = " + hddLetter + 
                "\nТактовая частота процессора в GHz = " + cpuGhz + 
                "\nОбъем жесткого диска в ГБ = " + hddGB);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = (penPrice + bookPrice) * 0.11;
        double discountPrice = penPrice + bookPrice - discount;
        System.out.println("Сумма скидки = " + discount + 
                "\nОбщая стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + 
                "\n   J   a a  v   v  a a" + 
                "\nJ  J  aaaaa  V V  aaaaa" + 
                "\n JJ  a     a  V  a     a");


        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("Тип переменной byte:\n" + byteMax + "\n" + ++byteMax + 
            "\n" + --byteMax);
        System.out.println("\nТип переменной short:\n" + shortMax + "\n" + ++shortMax + 
            "\n" + --shortMax);
        System.out.println("\nТип переменной int:\n" + intMax + "\n" + ++intMax + "\n" + --intMax);
        System.out.println("\nТип переменной long:\n" + longMax + "\n" + ++longMax + 
            "\n" + --longMax);


        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("I. Перестановка с помощью третьей переменной. Исходные значения:" + 
                "\nПервая переменная = " + num1 + ", Вторая переменная = "+num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения: Перая переменная = " + num1 + 
                ", Вторая переменная = " + num2 + 
                "\nII. C помощью арифметических операций. Исходные значения:" + 
                "\nПервая переменная = " + num1 + ", Вторая переменная = "+num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения: Перая переменная = " + num1 + 
                ", Вторая переменная = " + num2);
        System.out.println("II. C помощью побитовой операции. Исходные значения:" + 
                "\nПервая переменная = " + num1 + ", Вторая переменная = "+num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: Перая переменная = " + num1 + 
                ", Вторая переменная = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println((int) ch1 + " " + ch1);
        System.out.println((int) ch2 + " " + ch2);
        System.out.println((int) ch3 + " " + ch3);
        System.out.println((int) ch4 + " " + ch4);
        System.out.println((int) ch5 + " " + ch5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num3 = 123;
        System.out.println("Число " + num3 + " содержит:");
        System.out.println(num3 / 100 + " сотен");
        System.out.println(num3 / 10 % 10 + " десяток");
        System.out.println(num3 % 10 + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char space = ' ';
        char underline = '_';
        char lBracket = '(';
        char rBracket = ')';
        System.out.println("" + space + space + space + space+ slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underline + lBracket + space + 
                rBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + 
                space + backslash);
        System.out.println("" + slash + underline + underline + underline + underline + 
                slash + backslash + underline + underline + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int num4 = 345;
        int hundreds = num4 / 100;
        int dozens = num4 / 10 % 10;
        int ones = num4 % 100 % 10;
        int sum = num4 + dozens + ones;
        int mult = num4 * dozens * ones;
        System.out.println("Cумма цифр числа " + num4 + " = " + sum + 
                "\nПроизведение цифр числа " + num4 + " = " + mult);

        System.out.println("\n10. Преобразование секунд");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec / 60 ) % 60;
        int seconds = sec % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}