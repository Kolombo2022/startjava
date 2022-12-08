public class IfElseStatementTheme {

    public static void main (String[] args) {
        System.out.println("1 задача. Перевод псевдокода на язык Java ");
        byte age = 30;
        if(age > 20) {
            System.out.println("Взрослейте и находите себя в жизни");
        } else {
            System.out.println("Наслаждайтесь детством");
        }
        double height = 1.70;
        if(height < 1.80) {
            System.out.println("Пробовать виды спорта, кроме баскетбола");
        } else {
            System.out.println("Можно пробовать карьеру баскетболиста");
        }

        char firstSymbolName = 'A';
        if(firstSymbolName == 'B') {
            System.out.println("Можно");
        } else {
            System.out.println("Нет");
        }

        System.out.println("\n2 задача. Поиск max и min числа");
        int firstRandomNumber = 342;
        int secondRandomNumber = 420;
        int maxRandomNumber;
        int minRandomNumber;
        if(firstRandomNumber == secondRandomNumber) {
            System.out.println("Число " + firstRandomNumber + " = числу " + secondRandomNumber);
        } else {
            System.out.println(("Большее число из 2" ) + 
                    ("чисел: " + Math.max(firstRandomNumber,secondRandomNumber)));
        System.out.println(("Меньшее число из 2 чисел: ") + 
                (Math.min(firstRandomNumber,secondRandomNumber)));
        }

        System.out.println("\n3 задача. Проверка числа");
        byte anyNumber = -1;
        if(anyNumber == 0) {
        System.out.println("Число " + anyNumber + " является нулём");
        } else if(anyNumber > 0 & anyNumber % 2 == 0) {
            System.out.println("Число " + anyNumber + " положительное, чётное");
        } else if(anyNumber > 0 & anyNumber % 2 <= 1) {
            System.out.println("Число " + anyNumber + " положительное, нечётное");
        } else if(anyNumber < 0 & anyNumber % 2 == 0) {
            System.out.println("Число " + anyNumber + " отрицательное, чётное");
        } else if(anyNumber < 0 & anyNumber % 2 <= 1) {
            System.out.println("Число " + anyNumber + " отрицательное, нечётное");
        }

        System.out.println("\n4 задача. Поиск одинаковых цифр в числах");
        int num1 = 450;
        int num2 = 156;
        int firstDischargeNum1 = num1 % 10;
        int firstDischargeNum2 = num2 % 10;
        int secondDischargeNum1 = num1 / 10 % 10;
        int secondDischargeNum2 = num2 / 10 % 10;
        int thirdDischargeNum1 = num1 / 100;
        int thirdDischargeNum2 = num2 / 100;
        if ((thirdDischargeNum1 == thirdDischargeNum2 ) || 
                (secondDischargeNum1 == secondDischargeNum2) || 
                        (firstDischargeNum1 == firstDischargeNum2)) {
            System.out.println("Исходные числа " + num1 +" , " + num2);
        if(thirdDischargeNum1 == thirdDischargeNum2) 
            System.out.println("Одинаковые сотни " + thirdDischargeNum1);
        else 
            System.out.println("Неодинаковые сотни");
        if(secondDischargeNum1 == secondDischargeNum2) 
            System.out.println("Одинаковые десятки " + secondDischargeNum1);
        else 
            System.out.println("Неодинаковые десятки");
        if(firstDischargeNum1 == firstDischargeNum2) 
            System.out.println("Одинаковые единицы " + firstDischargeNum1);
        else 
            System.out.println("Неодинаковые единицы");
        }
        else 
            System.out.println("В разрядах нет одинаковых цифр");

        System.out.println("\n5 задача. Определение символа по его коду");
        char a = '\u0057';
        System.out.println(a + " маленькая буква");
        System.out.println((int)a + " число");

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

        System.out.println("\n7 задача. Определение оценки по предметам");
        int markHistoryPercent = 59;
        int markProgrammingPercent = 91;
        int finalProgrammingPercent;
        int finalHistoryPercent;
        if(markHistoryPercent > 91) {
            finalHistoryPercent = 5;
            System.out.println(("История " + markHistoryPercent) + 
                ("% соответствует оценке " + finalHistoryPercent));
        } else if(markHistoryPercent > 73) {
            finalHistoryPercent = 4;
            System.out.println(("История " + markHistoryPercent) + 
                    ("% соответствует оценке " + finalHistoryPercent));
        } else if(markHistoryPercent > 60) {
            finalHistoryPercent = 3;
            System.out.println(("История " + markHistoryPercent) + 
                    ("% соответствует оценке " + finalHistoryPercent));
        } else if(markHistoryPercent <= 60) {
            finalHistoryPercent = 2;
            System.out.println(("История " + markHistoryPercent) + 
                    ("% соответствует оценке " + finalHistoryPercent));
        } 
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