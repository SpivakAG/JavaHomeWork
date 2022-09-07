public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        boolean pcOsWin10 = true;
        byte ramGb = 16;
        short numberOfPrograms = 253;
        int ramMb = 16384;
        long hardDriveMb = 1048576;
        char hardDriveLetter = 'C';
        float cpuGhz = 3.20f;
        double hardDriveGB = 1024.0d;
        System.out.println("Операционная система это Win10 ?\n" + Boolean.toString(pcOsWin10) + 
            "\nОбъем оперативной памяти в ГБ =\n" + ramGb + 
            "\nКоличество установленных программ =\n" + numberOfPrograms + 
            "\nОбъем  оперативной памяти в МБ =\n" + ramMb + 
            "\nОбъем жесткого диска в МБ =\n" + hardDriveMb + 
            "\nБуква жесткого диска =\n" + hardDriveLetter + 
            "\nТактовая частота процессора в GHz =\n" + cpuGhz + 
            "\nОбъем жесткого диска в ГБ =\n" + hardDriveGB);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = (penPrice+bookPrice)*0.11;
        double sumPriceWithDicount = penPrice+bookPrice-discount;
        System.out.println("Сумма скидки = " + discount + "\nОбщая стоимость товаров со скидкой = " + sumPriceWithDicount);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a      \n   J   a a  v   v  a a    \n" + 
            "J  J  aaaaa  V V  aaaaa   \n JJ  a     a  V  a     a");


        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteType = Byte.MAX_VALUE;
        short shortType = Short.MAX_VALUE;
        int intType = Integer.MAX_VALUE;
        long longType = Long.MAX_VALUE;
        float floatType = Float.MAX_VALUE;
        double doubleType = Double.MAX_VALUE;
        System.out.println("Тип переменной byte:\n" + byteType);
        byteType++;
        System.out.println(byteType);
        byteType--;
        System.out.println(byteType + "\nТип переменной short:\n" + shortType);
        shortType++;
        System.out.println(shortType);
        shortType--;
        System.out.println(shortType + "\nТип переменной int:\n" + intType);
        intType++;
        System.out.println(intType);
        intType--;
        System.out.println(intType + "\nТип переменной long:\n" + longType);
        longType++;
        System.out.println(longType);
        longType--;
        System.out.println(longType + "\nТип переменной float:\n" + floatType);
        floatType++;
        System.out.println(floatType);
        floatType--;
        System.out.println(floatType + "\nТип переменной double:\n" + doubleType);
        doubleType++;
        System.out.println(doubleType);
        doubleType--;
        System.out.println(doubleType);

        System.out.println("\n5. Перестановка значений переменных");
        int firstInt = 2;
        int secondInt = 5;
        System.out.println("I. Перестановка с помощью третьей переменной. Исходные значения:" + 
            "\nПервая переменная = " + firstInt + ", Вторая переменная = "+secondInt);
        int additionalNumber = firstInt;
        firstInt=secondInt;
        secondInt=additionalNumber;
        System.out.println("Новые значения: Перая переменная = " + firstInt + 
            ", Вторая переменная = " + secondInt + 
            "\nII. с помощью арифметических операций. Исходные значения:" + 
            "\nПервая переменная = " + firstInt + ", Вторая переменная = "+secondInt);
        firstInt += secondInt;
        secondInt = firstInt - secondInt;
        firstInt -= secondInt;
        System.out.println("Новые значения: Перая переменная = " + firstInt + 
            ", Вторая переменная = " + secondInt);
        System.out.println("II. C помощью побитовой операции. Исходные значения:" + 
            "\nПервая переменная = " + firstInt + ", Вторая переменная = "+secondInt);
        firstInt=firstInt ^ secondInt;
        secondInt = firstInt ^ secondInt;
        firstInt = firstInt ^ secondInt;
        System.out.println("Новые значения: Перая переменная = " + firstInt + 
            ", Вторая переменная = " + secondInt);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        int chToInt = ch1;
        System.out.println(chToInt + " " + ch1);
        chToInt = ch2;
        System.out.println(chToInt + " " + ch2);
        chToInt = ch3;
        System.out.println(chToInt + " " + ch3);
        chToInt = ch4;
        System.out.println(chToInt + " " + ch4);
        chToInt = ch5;
        System.out.println(chToInt + " " + ch5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int number123 = 123;
        System.out.println("Число " + number123 + " содержит:");
        System.out.println(number123 / 100 + " сотен");
        System.out.println(number123 / 10 % 10 + " десяток");
        System.out.println(number123 % 100 % 10 + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char lSlash = '/';
        char rSlash = 92;
        char space = ' ';
        char underline = '_';
        char lBracket = '(';
        char rBracket = ')';
        System.out.println(""+ space + space + space + space+ lSlash + rSlash);
        System.out.println(""+ space + space + space + lSlash + space + space + rSlash);
        System.out.println(""+ space + space + lSlash + underline + lBracket + space + 
            rBracket + rSlash);
        System.out.println(""+ space + lSlash + space + space + space + space + space + 
            space + rSlash);
        System.out.println(""+ lSlash + underline + underline + underline + underline + 
            lSlash + rSlash + underline + underline + rSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int number345 = 345;
        int hundreds345 = number345/100;
        int dozens345 = number345 / 10 % 10;
        int units345 = number345 % 100 % 10;
        int sum345 = hundreds345 + dozens345 + units345;
        int mult345 = hundreds345 * dozens345 * units345;
        System.out.println("Cумма цифр числа N = " + sum345 + 
            "\nПроизведение цифр числа N = " + mult345);

        System.out.println("\n10. Преобразование секунд");
        int sec = 86399;
        int hours = sec/3600;
        int minutes = (sec - (hours * 3600)) / 60;
        int seconds = sec - hours * 3600 - minutes * 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}