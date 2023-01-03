public class CyclesTheme {

    public static void main (String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        byte counter = -10;
        byte sumEven = 0;
        byte sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println(("В промежутке [-10, 21] сумма четных чисел = ") +
                (sumEven + ", а нечетных = " + sumOdd));

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        byte num1 = 10;
        byte num2 = 5;
        byte num3 = -1;
        byte max;
        byte min;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (num3 < min) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.printf(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int anyNumber = 1234;
        int sumDigits = 0;
        while (anyNumber > 0) {
            int digit = anyNumber % 10;
            System.out.print(digit);
            sumDigits += digit;
            anyNumber /= 10;
        }
        System.out.println("\nСумма его цифр " + sumDigits);

        System.out.println("\nВывод чисел на консоль в несколько строк");
        int numDigitsPerLines = 0;
        for (int i = 1; i < 24; i += 2) {
            numDigitsPerLines++;
            System.out.printf("%3s", i);
            if (numDigitsPerLines == 5) {
                System.out.println();
                numDigitsPerLines = 0;
            }
        }
        if (numDigitsPerLines != 0) {
            while (numDigitsPerLines < 5) {
                System.out.printf("%3s", 0);
                numDigitsPerLines++;
            }
        }

        System.out.println("\nЗадание 5. Проверка количества двоек на четность/нечетность \n");
        int num4 = 3242592;
        int copyNum4 = num4;
        int numTwos = 0;
        while(copyNum4 > 0) {
            if(copyNum4 % 10 == 2) {
                numTwos++;
            }
            copyNum4 /= 10;
        }
        System.out.println("Число " + num4 + " содержит" + (numTwos / 2 == 0 ? " четное" : " нечетное") + 
                " количество двоек");

        System.out.println("\n6.Отображение фигур в консоли\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int triangleLine = 5;
        System.out.println();
        while (triangleLine > 0) {
            int finaltriangle = triangleLine;
            while (finaltriangle > 0) {
                System.out.print("#");
                finaltriangle--;
            }
            triangleLine--;
            System.out.println();
        }
        System.out.println();
        int finaltriangle2 = 1;
        do {
            if (finaltriangle2 % 4 != 0) {
                triangleLine = finaltriangle2 % 4;
            } else {
                triangleLine = 2;
            }
            do {
                System.out.print("$");
            } while (--triangleLine > 0);
            System.out.println();
            finaltriangle2++;
        } while (finaltriangle2 <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        char emblem;
        for(int n = 0; n < 53; n++) {
            if (n % 2 == 1) {
            System.out.print(n + " - ");
            emblem = (char)n;
            System.out.println(emblem);
            }
        }
        for(int n = 84; n < 111; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " - ");
                emblem = (char)n;
                System.out.println(emblem);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num5 = 1234321;
        int duplicateNum5 = num5;
        int num6 = 0;
        while (num5 != 0) {
            num6 = num6 * 10 + num5 % 10;
            num5 /= 10;
        }
        if (duplicateNum5 == num6) {
            System.out.println("Число " + duplicateNum5 +  " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num7 = 554872;
        int duplicateNum7 = num7;
        int sumAbc = 0;
        int sumDef;
        int j = 0;
        for(sumDef = 0; duplicateNum7 > 0; duplicateNum7 /= 10) {
            j++;
            if(j <= 3) {
                sumDef = sumDef + duplicateNum7 % 10;
            } else {
                sumAbc = sumAbc + duplicateNum7 % 10;
            }
        }
        System.out.println("Сумма цифр abc = " + sumAbc + " Сумма цифр def = " + sumDef);
        if(sumAbc == sumDef) {
            System.out.println("Число " + num7 + " является счастливым");
        } else {
            System.out.println("Число " + num7 + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("     ТАБЛИЦА       ПИФАГОРА");
        System.out.print("    |");
        for(int l = 2; l < 10; l++) {
            System.out.printf("%3d ", l);
        }
        System.out.print("\n----|--------------------------------\n");
        for(int l = 2; l < 10; l++) {
            System.out.printf("%3d |", l);
            for(int n = 2; n < 10; n++) {
                System.out.printf("%3d ", l * n);
            }
            System.out.println();
        }
    }
}

