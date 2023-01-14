public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1 задача. Вывод значений переменных на консоль");
        byte gen = 6;
        short tdp = 15;
        int freq = 520;
        long sock = 1356;
        float bus = 99.78f;
        double clockSpeed = 797.85;
        char energyUsage = 'U';
        boolean isMore = bus < clockSpeed ;
        System.out.println("gen = " + gen + "ое семейство процессора intel");
        System.out.println("tdp = " + tdp + " макс-ое выделение тепла");
        System.out.println("freq = " + freq + " графическое ядро");
        System.out.println("sock = " + sock + " сокет процессора");
        System.out.println("bus = " + bus + " внешняя частота процессора");
        System.out.println("clockSpeed = " + clockSpeed + " тактовая частота процессора");
        System.out.println(("energyUsage = " + energyUsage + " процессор") + 
                ("с низким энергопотреблением"));
        System.out.println("isMore = " + isMore + " внешняя частота меньше тактовой");

        System.out.println("\n2 задача. Расчет стоимости товара со скидкой");
        byte pricePen = 100;
        short priceBook = 200;
        byte discount = 11;
        int discountAmount = ((pricePen + priceBook) * discount / 100);
        System.out.println("Cумма скидки = " + discountAmount);
        System.out.println(("Общая сто-сть товаров со скидкой = " +" ") + 
                (pricePen + priceBook - discountAmount));

        System.out.println("\n3 задача. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807l;
        System.out.println("byte(перв-ое знач.)= " + byteMax);
        byteMax++;
        System.out.println("знач. после инкр-та = " + byteMax);
        byteMax--;
        System.out.println("знач. после декр-та = " + byteMax);
        System.out.println("short(перв-ое знач.)= " + shortMax);
        shortMax++;
        System.out.println("знач. после инкр-та = " + shortMax);
        shortMax--;
        System.out.println("знач. после декр-та = " + shortMax);
        System.out.println("int(перв-ое знач.)= " + intMax);
        intMax++;
        System.out.println("знач. после инкр-та = " + intMax);
        intMax--;
        System.out.println("знач. после декр-та = " + intMax);
        System.out.println("long(перв-ое знач.)= " + longMax);
        longMax++;
        System.out.println("знач. после инкр-та = " + longMax);
        longMax--;
        System.out.println("знач. после декр-та = " + longMax);

        System.out.println("\n5.1 Перестановка значений переменных с помощью третьей переменной");
        int num1 = 2;
        int num2 = 5;
        int temp = num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        num2 = num1;
        num1 = temp;
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        System.out.println(("\n5.2 Перестановка значений переменных ") + 
                ("с помощью арифметических операций"));
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        System.out.println("\n5.3 Перестановка значений переменных с помощью побитовой операции ^");
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char number = '#';
        int convertNumber = number;
        char ampersand = '&';
        int convertAmpersand = ampersand;
        char dog = '@';
        int convertDog = dog;
        char caret = '^';
        int convertCaret = caret;
        char underscore = '_';
        int convertUnderscore = underscore;
        System.out.println("код символа " + (int) number + " символ #");
        System.out.println("код символа " + (int) ampersand + " символ &");
        System.out.println("код символа " + (int) dog + " символ @");
        System.out.println("код символа " + (int) caret + " символ ^");
        System.out.println("код символа " + (int) underscore + " символ _");

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = srcNum / 10 % 10;
        int ones = srcNum % 10;
        System.out.println("Число N содержит");
        System.out.println("X сотен = " + hundreds);
        System.out.println("Y десятков = " + tens);
        System.out.println("Z единиц = " + ones);

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char bracketOpens = '(';
        char bracketClosed = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println(("  " + slash + underscore + bracketOpens) + 
                (" " + bracketClosed + backSlash));
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println((slash + "" + underscore + "" + underscore + "" + underscore) + 
                (("" + underscore + slash + backSlash + "" + underscore) + 
                ("" + underscore + backSlash)));

        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        srcNum = 345;
        hundreds = srcNum / 100;
        tens = srcNum / 10 % 10;
        ones = srcNum % 10;
        System.out.println("Сумма цифр числа 345 = " + (hundreds + tens + ones));
        System.out.println("Их произведение = " + (hundreds * tens * ones));

        System.out.println("\n10. Вывод времени");
        int srcSeconds = 86399;
        int minutes = srcSeconds / 60 % 60;
        int hours = srcSeconds / 3600;
        int seconds = srcSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}