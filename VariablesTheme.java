public class VariablesTheme {

    public static void main (String[] args) {
        System.out.println("1 задача. Вывод значений переменных на консоль");
        byte gen = 6;
        short tdp = 15;
        int freq = 520;
        long sock = 1356;
        float bus = 99.78f;
        double clockspeed = 797.85;
        char energyusage = 'U';
        boolean isMore = bus < clockspeed ;
        System.out.println("gen = " + gen + "ое семейство процессора intel");
        System.out.println("tdp = " + tdp + " макс-ое выделение тепла");
        System.out.println("freq = " + freq + " графическое ядро");
        System.out.println("sock = " + sock + " сокет процессора");
        System.out.println("bus = " + bus + " внешняя частота процессора");
        System.out.println("clockspeed = " + clockspeed + " тактовая частота процессора");
        System.out.println("energyusage = " + energyusage + " процессор с низким энергопотреблением");
        System.out.println("isMore = " + isMore + " внешняя частота меньше тактовой");

        System.out.println("\n2 задача. Расчет стоимости товара со скидкой");
        byte costpen = 100;
        short costbook = 200;
        byte discount = 11;
        int discountamount =(costpen * discount / 100)+(costbook * discount / 100);
        System.out.println("Cумма скидки = " + discountamount);
        System.out.println("Общая сто-сть товаров со скидкой = " +(costpen + costbook - discountamount));

        System.out.println("\n3 задача. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxsinglebytenumber = 127;
        short maxtwobytenumber = 32_767;
        int maxfourbytenumber = 2_147_483_647;
        long maxeightbytenumber = 9_223_372_036_854_775_807l;
        System.out.println("byte(перв-ое знач.)= " + maxsinglebytenumber);
        System.out.println("byte(знач. после инкр-та)= " + maxsinglebytenumber++);
        System.out.println("byte(знач. после декр-та)= " + maxsinglebytenumber--);
        System.out.println("short(перв-ое знач.)= " + maxtwobytenumber);
        System.out.println("short(знач. после инкр-та)= " + maxtwobytenumber++);
        System.out.println("byte(знач. после декр-та)= " + maxtwobytenumber--);
        System.out.println("int(перв-ое знач.)= " + maxfourbytenumber);
        System.out.println("int(знач. после инкр-та)= " + maxfourbytenumber++);
        System.out.println("int(знач. после декр-та)= " + maxfourbytenumber--);
        System.out.println("long(перв-ое знач.)= " + maxeightbytenumber);
        System.out.println("long(знач. после инкр-та)= " + maxeightbytenumber++);
        System.out.println("long(знач. после декр-та)= " + maxeightbytenumber--);

        System.out.println("\n5.1 Перестановка значений переменных с помощью третьей переменной");
        int first = 2;
        int second = 5;
        int temp = second;
        System.out.println("first = " + first + " second = " + second);
        second = first;
        first = temp;
        System.out.println("first = " + first + " second = " + second);

        System.out.println("\n5.2 Перестановка значений переменных с помощью арифметических операций");
        System.out.println("first = " + first + " second = " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("first = " + first + " second = " + second);

        System.out.println("\n5.3 Перестановка значений переменных с помощью побитовой операции ^");
        System.out.println("first = " + first + " second = " + second);
        first = first ^ second;
        second = second ^ first;
        first = first ^ second;
        System.out.println("first = " + first + " second = " + second);

        System.out.println("\n6. Вывод символов и их кодов");
        char grid = 35;
        char ampersand = 38;
        char dog = 64;
        char caret = 94;
        char underscore = 95;
        System.out.println("код 35 = " + grid);
        System.out.println("код 38 = " + ampersand);
        System.out.println("код 64 = " + dog);
        System.out.println("код 94 = " + caret);
        System.out.println("код 95 = " + underscore);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int onehundredtwentythree = 123;
        int hundreds = onehundredtwentythree / 100;
        int dozens = onehundredtwentythree / 10 % 10;
        int units = onehundredtwentythree % 10;
        System.out.println("Число N содержит");
        System.out.println("X сотен = " + hundreds);
        System.out.println("Y десятков = " + dozens);
        System.out.println("Z единиц = " + units);

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char slash1 = 92;
        char bracketopens = '(';
        char bracketclosed = ')';
        System.out.println("    " + slash + slash1);
        System.out.println("   " + slash + "  " + slash1);
        System.out.println("  " + slash + underscore + bracketopens + " " + bracketclosed + slash1);
        System.out.println(" " + slash + "      " + slash1);
        System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" + underscore + slash + slash1 + "" + underscore + "" + underscore + slash1);

        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        short threehundredfortyfive = 345;
        int hundreds1 = threehundredfortyfive / 100;
        int dozens2 = threehundredfortyfive / 10 % 10;
        int units3 = threehundredfortyfive % 10;
        System.out.println("Сумма цифр числа 345 = " +(hundreds1 + dozens2 + units3));
        System.out.println("Их произведение = " +(hundreds1 * dozens2 * units3));

        System.out.println("\n10. Вывод времени");
        int sec = 86399;
        int minute = sec / 60 % 60;
        int hour = sec / 3600;
        System.out.println(hour + ":" + minute + ":" +(sec % 60));
    }
}