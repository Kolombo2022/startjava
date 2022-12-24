public class IfElseStatementTheme {

    public static void main (String[] args) {
        System.out.println("1 задача. Перевод псевдокода на язык Java ");
        byte age = 30;
        if (age > 20) {
            System.out.println("Взрослейте и находите себя в жизни");
        } else {
            System.out.println("Наслаждайтесь детством");
        }

        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("\nЭто женщина");
        } else {
            System.out.println("\nЭто мужчина");
        }

        double height = 1.70;
        if (height < 1.80) {
            System.out.println("\nПробовать виды спорта, кроме баскетбола");
        } else {
            System.out.println("\nМожно пробовать карьеру баскетболиста");
        }

        char capitalLettes = "Vasya".charAt(0);
        if(capitalLettes == 'M') {
            System.out.println("\nПервая буква имени M");
        } else if(capitalLettes == 'I') {
            System.out.println("\nПервая буква имени I");
        } else {
            System.out.println("\nПервая буква имени V");
        }

        System.out.println("\n2 задача. Поиск max и min числа");
        int num1 = 400;
        int num2 = 420;
        if (num1 < num2) {
            System.out.println("Число " + num1 + " минимальное, а число " + num2 + " максимальное");
        } else if(num1 > num2) {
            System.out.println("Число " + num1 + " максимальное, а число " + num2 + " минимальное");
        } else
            System.out.println("Число " + num1 + " = числу " + num2);

        System.out.println("\n3 задача. Проверка числа");
        int anyNumber = 11;
            System.out.println("Исходное число " + anyNumber);
        if (anyNumber != 0) {
        if (anyNumber > 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
        if (anyNumber % 2 == 0) {
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }
        }

        System.out.println("\n4 задача. Поиск одинаковых цифр в числах");
        int num3 = 400;
        int num4 = 425;
        int hundreds = num3 / 100;
        int tens = num3 / 10 % 10;
        int ones = num3 % 10;
            System.out.println("Исходные числа " + num3 +" , " + num4);
        if (hundreds == num4 / 100) {
            System.out.println("Одинаковые сотни " + hundreds);
        if (tens == num4 / 10 % 10) 
            System.out.println("Одинаковые десятки " + tens);
        if (ones == num4 % 10) 
            System.out.println("Одинаковые единицы " + ones);
        } else 
            System.out.println("В разрядах нет одинаковых цифр");

        System.out.println("\n5 задача. Определение символа по его коду");
        char code = '\u005A';
        if (code >= 'a' && code <= 'z') {
            System.out.println("Код является маленькой буквой " + code);
        } else if (code >= 'A' && code <= 'Z') {
            System.out.println("Код является заглавной буквой " + code);
        } else if (code >= '0' && code <= '9') {
            System.out.println("Код является числом " + code);
        } else
            System.out.println("Код является не буквой, не числом " + code);

        System.out.println("\n6 задача. Подсчёт суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        double depositInterest;
            System.out.println("Сумма вклада " + depositAmount + " руб.");
        if (depositAmount < 100_000) {
        depositInterest = depositAmount * 1.05;
            System.out.println("Начисленный процент = 5 процентов");
            System.out.println("Итоговая сумма с процентами " + depositInterest + " руб.");
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
        depositInterest = depositAmount * 1.07;
            System.out.println("Начисленный процент = 7 процентов");
        } else {
        depositInterest = depositAmount * 1.1;
            System.out.println("Начисленный процент = 10 процентов");
        }
            System.out.println("Итоговая сумма с процентами " + depositInterest + " руб.");

        System.out.println("\n7 задача. Определение оценки по предметам");
        int markHistoryPercent = 59;
        int markProgrammingPercent = 91;
        int finalHistoryPercent;
        int finalProgrammingPercent;
        if (markHistoryPercent > 91) {
            finalHistoryPercent = 5;
        } else if (markHistoryPercent > 73) {
            finalHistoryPercent = 4;
        } else if (markHistoryPercent > 60) {
            finalHistoryPercent = 3;
        } else {
            finalHistoryPercent = 2;
        }
            System.out.println("История оценка " + finalHistoryPercent);
        if (markProgrammingPercent > 91) {
            finalProgrammingPercent = 5;
        } else if (markProgrammingPercent > 73) {
            finalProgrammingPercent = 4;
        } else if (markProgrammingPercent > 60) {
            finalProgrammingPercent = 3;
        } else {
            finalProgrammingPercent = 2;
        }
            System.out.println("Программирование оценка " + finalProgrammingPercent);
            System.out.println(("Средний балл оценок по предметам ") + 
                    ((finalHistoryPercent + finalProgrammingPercent) / 2));
            System.out.println(("Средний процент по предметам ") +
                    (((markHistoryPercent + markProgrammingPercent) / 2)));

        System.out.println("\n8 задача. Расчет прибыли за год");
        int rentPremises = 5000;
        int saleGoods = 13000;
        int costGoods = 9000;
        int annualProfit = (saleGoods - rentPremises - costGoods) * 12;
        if (annualProfit < 0) {
            System.out.println("прибыль за год: " + annualProfit + " руб.");
        } else {
            System.out.println("прибыль за год: +" + annualProfit + " руб.");
        }

        System.out.println("\n9 задача. Подсчёт количества банкнот");
        int banknotes100 = 10;
        int banknotes10 = 5;
        int banknotes1 = 50;
        int totalWithdraw = 225;
        int checkSum = banknotes100 * 100 + banknotes10 * 10 + banknotes1 * 1;
        if (checkSum > totalWithdraw && totalWithdraw > 0) {
        if (banknotes100 >= totalWithdraw / 100 && totalWithdraw >= 100) {
        int sum100 = totalWithdraw / 100;
            System.out.println(sum100 + " банкноты номиналом 100");
        if (totalWithdraw - sum100 != 0) {
        int sum10 = (totalWithdraw - sum100 * 100) / 10;
            System.out.println(sum10 + " банкноты номиналом 10");
        }
        if (totalWithdraw - sum100 * 100 - (totalWithdraw - sum100 * 100) / 10 != 0) {
        int sum1 = (totalWithdraw - sum100 * 100) % 10;
            System.out.println(sum1 + " банкноты номиналом 1");
        }
        } else {
        if (banknotes10 >= totalWithdraw / 10 && totalWithdraw >= 10) {
        int sum10 = totalWithdraw / 10;
            System.out.println(sum10 + " банкноты номиналом 10");
        if (totalWithdraw - sum10 != 0) {
        int sum1 = totalWithdraw % 10;
            System.out.println(sum1);
        }
        } else {
        int sum1 = totalWithdraw;
        }
        }
        } else {
            System.out.println("Текущая сумма доступна");
        }
    }
}