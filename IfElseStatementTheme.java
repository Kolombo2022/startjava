public class IfElseStatementTheme {

    public static void main (String[] args) {
        System.out.println("1 задача. Перевод псевдокода на язык Java ");
        byte age = 30;
        if(age > 20) {
            System.out.println("Взрослейте и находите себя в жизни");
        } else {
            System.out.println("Наслаждайтесь детством");
        }

        boolean maleGender = true;
        if(!maleGender) {
            System.out.println("\nЭто женщина");
        } else {
            System.out.println("\nЭто мужчина");
        }

        double height = 1.70;
        if(height < 1.80) {
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
        if(num1 < num2) {
            System.out.println("Число " + num1 + " минимальное, а число " + num2 + " максимальное");
        } else if(num1 > num2) {
            System.out.println("Число " + num1 + " максимальное, а число " + num2 + " минимальное");
        } else
            System.out.println("Число " + num1 + " = числу " + num2);

        System.out.println("\n3 задача. Проверка числа");
        int anyNumber = 10;
        if(anyNumber != 0) {
            if (anyNumber > 0 & anyNumber % 2 == 0) 
            System.out.println(anyNumber + " положительное, чётное");
            else if (anyNumber > 0 & anyNumber % 2 <= 1) 
            System.out.println(anyNumber + " положительное, нечётное");
            else if (anyNumber < 0 & anyNumber % 2 == 0)
            System.out.println(anyNumber + " отрицательное, чётное");
            else if (anyNumber < 0 & anyNumber % 2 <= 1)
            System.out.println(anyNumber + " отрицательное, нечётное");
        }
        

        System.out.println("\n4 задача. Поиск одинаковых цифр в числах");
        int hundreds = num1 / 100;
        int tens = num1 / 10 % 10;
        int units = num1 % 10;
        if ((hundreds == num2 / 100 ) || 
                (tens == num2 / 10 % 10) || 
                (units == num2 % 10)) {
            System.out.println("Исходные числа " + num1 +" , " + num2);
        if(hundreds == num2 / 100) 
            System.out.println("Одинаковые сотни " + hundreds);
        if(tens == num2 / 10 % 10) 
            System.out.println("Одинаковые десятки " + tens);
        if(units == num2 % 10) 
            System.out.println("Одинаковые единицы " + units);
        } else 
            System.out.println("В разрядах нет одинаковых цифр");

        System.out.println("\n5 задача. Определение символа по его коду");
        int up = 92;
        int u = 117;
        int zero = 48;
        int five = 53;
        int seven = 55;
        char a = '\u0057';
        System.out.println(a + " это ASCII символ");
        System.out.println((((char)up) + "" + ((char)u) + "" + ((char)zero) + "") + 
                (((char)zero) + "" + ((char)five) + "" + ((char)seven)));

        System.out.println("\n6 задача. Подсчёт суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        double depositInterest;
        System.out.println("Сумма вклада " + depositAmount + " руб.");
        if(depositAmount < 100_000) {
            depositInterest = depositAmount * 1.05;
            System.out.println("Начисленно 5 процентов");
            System.out.println("Итоговая сумма с процентами " + depositInterest + " руб.");
        } else if(depositAmount >= 100_000 && depositAmount <= 300_000) {
            depositInterest = depositAmount * 1.07;
            System.out.println("Начисленно 7 процентов");
            System.out.println("Итоговая сумма с процентами " + depositInterest + " руб.");
        } else if(depositAmount > 300_000) {
            depositInterest = depositAmount * 1.1;
            System.out.println("Начисленно 10 процентов");
            System.out.println("Итоговая сумма с процентами " + depositInterest + " руб.");
        }
        /*System.out.println(depositInterest);*/

        System.out.println("\n7 задача. Определение оценки по предметам");
        int markHistoryPercent = 59;
        int markProgrammingPercent = 91;
        int finalProgrammingPercent;
        int finalHistoryPercent;
        if(markHistoryPercent > 91) {
            finalHistoryPercent = 5;
            System.out.println((markHistoryPercent) + 
            ("% соответствует оценке " + finalHistoryPercent));
        } else if(markHistoryPercent > 73) {
            finalHistoryPercent = 4;
            System.out.println((markHistoryPercent) + 
            ("% соответствует оценке " + finalHistoryPercent));
        } else if(markHistoryPercent > 60) {
            finalHistoryPercent = 3;
            System.out.println((markHistoryPercent) + 
            ("% соответствует оценке " + finalHistoryPercent));
        } else if(markHistoryPercent <= 60) {
            finalHistoryPercent = 2;
            System.out.println((markHistoryPercent) + 
            ("% соответствует оценке " + finalHistoryPercent));
        } 
        /*System.out.println(finalHistoryPercent);*/
        if (markProgrammingPercent > 91) {
            finalProgrammingPercent = 5;
            System.out.println(("Программирование " + markProgrammingPercent) + 
            ("% соответствует оценке " + finalProgrammingPercent));
        } else if(markProgrammingPercent > 73) {
            finalProgrammingPercent = 4;
            System.out.println(("Программирование " + markProgrammingPercent) + 
            ("% соответствует оценке " + finalProgrammingPercent));
        } else if(markProgrammingPercent > 60) {
            finalProgrammingPercent = 3;
            System.out.println(("Программирование " + markProgrammingPercent) + 
            ("% соответствует оценке " + finalProgrammingPercent));
        } else if(markProgrammingPercent <= 60) {
            finalProgrammingPercent = 2;
            System.out.println(("Программирование " + markProgrammingPercent) + 
            ("% соответствует оценке " + finalProgrammingPercent));
        }

        System.out.println("\n8 задача. Расчет прибыли за год");
        int rentPremises = 5000;
        int saleGoods = 13000;
        int costGoods = 9000;
        int annualProfit = saleGoods - rentPremises - costGoods ;
        if(annualProfit < 0) {
            System.out.println("прибыль за год: " + annualProfit + " руб.");
        } else if(annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit + " руб.");
        }

            System.out.println("\n9 задача. Подсчёт количества банкнот");
        int totalWithdraw = 567;
        int nominal100 = totalWithdraw / 100;
        int nominal10 = totalWithdraw / 10 % 10;
        int nominal1 = totalWithdraw % 10;
        int remains100 = 10;
        int remains10 = 5;
        int remains1 = 50;
        int remains11 = nominal10 - remains10;
        if(totalWithdraw >= 100) {
            System.out.println("Количество 100ых банкнот " + nominal100 + " шт.");
        if(nominal10 > remains10)
            System.out.println("Количество 10ых банкнот " + remains10 + " шт.");
        else 
            System.out.println("Количество 10ых банкнот " + nominal10 + " шт.");
        }
            System.out.println(("Количество 1ых банкнот "  + (((nominal10 - remains10)) * 
            ((10)) + nominal1) + " шт."));
        }
        }