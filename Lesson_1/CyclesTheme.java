public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        int counter = -10;
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
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if(num1 < num2) {
            max = num2;
            min = num1;
        } 
        if(min > num3) {
            min = num3;
        }
        if(max < num3) {
            max = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "\n3. Вывод реверсивного числа и суммы его цифр");
        num3 = 1234;
        int sumDigits = 0;
        while (num3 > 0) {
            int digit = num3 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num3 /= 10;
        }
        System.out.println("\nСумма его цифр " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int numDigitsPerLine = 0;
        for (int i = 1; i < 24; i += 2) {
            numDigitsPerLine++;
            System.out.printf("%3s", i);
            if (numDigitsPerLine == 5) {
                System.out.println();
                numDigitsPerLine = 0;
            }
        }
        if (numDigitsPerLine != 0) {
            while (numDigitsPerLine < 5) {
                System.out.printf("%3s", 0);
                numDigitsPerLine++;
            }
        }

        System.out.println("\n" + "\n5. Проверка количества двоек на четность/нечетность");
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

        int amountLines = 5;
        System.out.println();
        while (amountLines > 0) {
            counter = amountLines;
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            amountLines--;
            System.out.println();
        }
        System.out.println();

        counter = 1;
        do {
            if (counter % 4 != 0) {
                amountLines = counter % 4;
            } else {
                amountLines = 2;
            }
            do {
                System.out.print("$");
            } while (--amountLines > 0);
            System.out.println();
            counter++;
        } while (counter <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        for(int i = 0; i < 53; i++) {
            if (i % 2 == 1) {
                System.out.printf("%3d%4c%n", i, i);
            }
        }
        for(int i = 84; i < 111; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d%4c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num5 = 1234321;
        int copyNum5 = num5;
        int reversedNum = 0;
        while (num5 > 0) {
            reversedNum = reversedNum * 10 + num5 % 10;
            num5 /= 10;
        }
        if (copyNum5 == reversedNum) {
            System.out.println("Число " + copyNum5 +  " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num7 = 554872;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int j = 0;
        while(num7 > 0) {
            int remainder = num7 % 10;
            num7 /= 10;
            j++;
            if(j <= 3) {
                sumRightHalf = sumRightHalf + remainder;
            } else {
                sumLeftHalf = sumLeftHalf + remainder;
            }
        }
        System.out.println("Сумма цифр LeftHalf = " + sumLeftHalf + " Сумма цифр RightHalf = " + sumRightHalf);
        if(sumLeftHalf == sumRightHalf) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("     ТАБЛИЦА       ПИФАГОРА");
        System.out.print("    |");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.print("\n----|--------------------------------\n");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%3d |", i);
            for(int k = 2; k < 10; k++) {
                System.out.printf("%3d ", i * k);
            }
            System.out.println();
        }
    }
}