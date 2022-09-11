public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 25;
        String sex = "male";
        double height = 1.83;
        if(age > 20) {
            System.out.println("Тебе уже " + age + " ? Ты почти старик");
        } else {
            System.out.println("Тебе всего лишь " + age + "Ты еще мелкий");
        }

        if(sex != "male") {
            System.out.println("Ты девчонка");
        } else {
            System.out.println("Ты парень");
        }

        if(height < 1.80) {
            System.out.println("Ты почти полторашка");
        } else {
            System.out.println("Ты высокий");
        }
        char firstLetterOfName = "Artem".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Твое имя начинается на M");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Твое имя начинается на I");
        } else {
            System.out.println("Это вобще имя?");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 2;
        int num2 = 1;
        if(num1 > num2) {
            System.out.println("max = " + num1 + ", min = " + num2);
        } else if(num1 < num2) {
            System.out.println("max = " + num2 + ", min = " + num1);
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        }

        System.out.println("\n3. Работа с числом");
        int num3 = 123;
        if(num3 != 0){
            if(num3 % 2 == 0) {
                System.out.println("Число " + num3 + " четное");
            } else {
                System.out.println("Число " + num3 + " нечетное");
            }
            if(num3 > 0) {
                System.out.println("Число " + num3 + " положительное");
            } else {
                System.out.println("Число " + num3 + " отрицательное");
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 123;
        int num5 = 321;
        System.out.println("Исходные числа " + num4 + " и " + num5);
        int num4Hundreds = num4 / 100;
        int num5Hundreds = num5 / 100;
        int num4Dozens = num4 % 100 /10;
        int num5Dozens = num5 % 100 /10;
        int num4Ones = num4 % 10;
        int num5Ones = num5 % 10;
        if(num4Hundreds == num5Hundreds) {
            System.out.println("Сотни в числах совпадают и равны " + num4Hundreds);
        }
        if(num4Dozens == num5Dozens) {
            System.out.println("Десятки в числах совпадают и равны " + num4Dozens);
        }
        if(num4Ones == num5Ones) {
            System.out.println("Единицы в числах совпадают и равны " + num4Ones);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if(symbol >= 0 & symbol <= 47 | symbol >= 58 & symbol <= 64 |symbol >= 91 & symbol <= 96 | symbol >= 123) {
            System.out.println("Символ " + symbol + " не число и не буква");
        } else if(symbol >= 48 & symbol <= 57) {
            System.out.println("Символ " + symbol + " цифра");
        } else if(symbol >= 65 & symbol <= 90) {
            System.out.println("Символ " + symbol + " это большая буква");
        } else {
            System.out.println("Символ " + symbol + " это маленькая буква");
        }

        System.out.println("\n6. Определение буквы, числа или символа по их коду");
        double deposit = 300000;
        double accruedInterest = 0;
        double finalSum = 0;
        if(deposit < 100000) {
            finalSum = deposit * 1.05;
            accruedInterest = finalSum - deposit;
        } else if(deposit >= 100000 & deposit <= 300000){
            finalSum = deposit * 1.07;
            accruedInterest = finalSum - deposit;
        } else {
            finalSum = deposit * 1.1;
            accruedInterest = finalSum - deposit;
        }
        System.out.println("Сумма вклада = " + deposit + " , начисленный процент = " 
                + accruedInterest + " , итоговая сумма = " + finalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int progPercent = 91;
        int historyScore = 0;
        int progScore = 0;
        if(historyPercent <= 60) {
            historyScore = 2;
        } else if(historyScore > 60 & historyScore<=73) {
            historyScore = 3;
        } else if (historyScore > 73 & historyScore <= 91) {
            historyScore= 4;
        } else {
            historyScore = 5;
        }
        if(progPercent <= 60) {
            progScore = 2;
        } else if(progScore > 60 & progScore <= 73) {
            progScore = 3;
        } else if (progScore > 73 & progScore <= 91) {
            progScore = 4;
        } else {
            progScore = 5;
        }
        double averageScore = (progScore + historyScore) / 2;
        double averagePercent = (historyPercent  + progPercent) / 2;

        System.out.println("Итоговая оценка по истории " + historyScore +
                "\nИтоговая оценка по программированию " + progScore +
                "\nСредний балл оценок по предметам " + averageScore +
                "\nСредний % по предметам " + averagePercent);

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int averageSales = 13000;
        int costOfGoods = 9000;
        int profitForYear = (averageSales - costOfGoods - rent) * 12;
        System.out.println("Прибыль за год ");
        if(profitForYear > 0) {
            System.out.println("+" + profitForYear);
        } else {
            System.out.println(profitForYear);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int cash = 567;
        int atmBill1 = 100;
        int atmBill2 = 10;
        int atmBill3 = 1;
        int cashHundreds = cash / 100;
        int cashDozens = cash % 100 / 10;
        int cashOnes = cash % 10;
        cashOnes += (cashDozens - 5) * 10;
        cashDozens = 5;
        int cashToIssue = cashHundreds * 100 + cashDozens * 10 + cashOnes;
        System.out.println("Номиналы банкнот:\n" + atmBill1 + " USD\n" + atmBill2 + " USD\n" +
                atmBill3 + " USD\n" + "Для выдачи необходимо:\n" + atmBill1 + " USD " +
                cashHundreds + " шт.\n" + atmBill2 + " USD " + cashDozens + " шт.\n" + atmBill3 +
                " USD " + cashOnes + " шт.");
        if(cashToIssue == cash) {
            System.out.println("Исходная подсчитанная сумма = " + cashToIssue);
        } else {
            System.out.println("Ошибка при  выдаче срадств, обратитесь к оператору");
        }
    }
}