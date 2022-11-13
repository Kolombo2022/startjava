public class VariablesTheme {

    public static void main (String[] args) {
        /*1.    Вывод значений переменных на консоль */
        byte gen = 6;
        short tdp = 15;
        int freq = 520;
        long sock = 1356;
        float bus = 99.78f;
        double core = 797.85;
        char c = 'U';
        boolean isMore = bus < core ;
            System.out.println("1 задача. Вывод значений переменных на консоль");
            System.out.println("gen = " + gen + "ое семейство процессора intel");
            System.out.println("tdp = " + tdp + " макс-ое выделение тепла");
            System.out.println("freq = " + freq + " графическое ядро");
            System.out.println("sock = " + sock + " сокет процессора");
            System.out.println("bus = " + bus + " внешняя частота процессора");
            System.out.println("core = " + core + " тактовая частота процессора");
            System.out.println("c = " + c + " процессор с низким энергопотреблением");
            System.out.println("isMore = " + isMore + " внешняя частота меньше тактовой");

        /*2. Расчет стоимости товара со скидкой */
        byte pen = 100;
        short book = 200;
        byte dis = 11;
            System.out.println("\n2 задача. Расчет стоимости товара со скидкой");
            System.out.println("Cумма скидки = " + ((pen * dis / 100) + (book * dis / 100)));
            System.out.println("Общая сто-сть товаров со скидкой = " + (( pen - 33 ) + ( book - 33 )));

        /*3. Вывод слова JAVA */
            System.out.println("\n3 задача. Вывод слова JAVA");
            System.out.println("   J    a  v     v  a");
            System.out.println("   J   a a  v   v  a a");
            System.out.println("J  J  aaaaa  V V  aaaaa");
            System.out.println(" JJ  a     a  V  a     a");

        /*4. Вывод min и max значений целых числовых типов*/
        byte b1 = 127;
        short sh = 32_767;
        int i1 = 2_147_483_647;
        long l = 9_223_372_036_854_775_807l;
            System.out.println("\n4. Вывод min и max значений целых числовых типов");
            System.out.println("byte (перв-ое знач.) = " + b1);
            b1++;
            System.out.println("byte (знач. после инкр-та) = " + b1);
            b1--;
            System.out.println("byte (знач. после декр-та) = " + b1);
            System.out.println("short (перв-ое знач.) = " + sh);
            sh++;
            System.out.println("short (знач. после инкр-та) = " + sh);
            sh--;
            System.out.println("byte (знач. после декр-та) = " + sh);
            System.out.println("int (перв-ое знач.) = " + i1);
            i1++;
            System.out.println("int (знач. после инкр-та) = " + i1);
            i1--;
            System.out.println("int (знач. после декр-та) = " + i1);
            System.out.println("long (перв-ое знач.) = " + l);
            l++;
            System.out.println("long (знач. после инкр-та) = " + l);
            l--;
            System.out.println("long (знач. после декр-та) = " + l);

        /*5. Перестановка значений переменных*/
        int first = 2;
        int second = 5;
        int temp;
            System.out.println("\n5.1 Перестановка значений переменных с помощью третьей переменной");
            System.out.println("first = " + first + " second = " + second);
            temp = second;
            second = first;
            first = temp;
            System.out.println("first = " + first + " second = " + second);

        int first1 = 2;
        int second1 = 5;
            System.out.println("\n5.2 Перестановка значений переменных с помощью арифметических операций");
            System.out.println("first1 = " + first1 + " second1 = " + second1);
            first1 = first1 + second1;
            second1 = first1 - second1;
            first1 = first1 - second1;
            System.out.println("first1 = " + first1 + " second1 = " + second1);

            System.out.println("\n5.3 Перестановка значений переменных с помощью побитовой операции ^");
            System.out.println("first1 = " + first1 + " second1 = " + second1);
            first1 = first1 ^ second1;
            second1 = second1 ^ first1;
            first1 = first1 ^ second1;
            System.out.println("first1 = " + first1 + " second1 = " + second1);

        /*6. Вывод символов и их кодов*/
        char thirtyf = 35;
        char thirtye = 38;
        char sixtyf = 64;
        char ninetyf = 94;
        char ninetyfi = 95;
            System.out.println("\n6. Вывод символов и их кодов");
            System.out.println("35 = " + thirtyf);
            System.out.println("38 = " + thirtye);
            System.out.println("64 = " + sixtyf);
            System.out.println("94 = " + ninetyf);
            System.out.println("95 = " + ninetyfi);

        /*7. Вывод количества сотен, десятков и единиц числа*/
        int x = 123 / 100;
        int y = 123 / 10 % 10;
        int z = 123 % 10;
            System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
            System.out.println("Число N содержит");
            System.out.println("X сотен = " + x);
            System.out.println("Y десятков = " + y);
            System.out.println("Z единиц = " + z);

            /*8. Вывод в консоль ASCII-арт Дюка*/
        char slash = 47;
        char slash1 = 92;
        char slash2 = 95;
        char slash3 = 40;
        char slash4 = 41;
            System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
            System.out.println("    " + slash + slash1);
            System.out.println("   " + slash + "  " + slash1);
            System.out.println("  " + slash + slash2 + slash3 + " " + slash4 + slash1 );
            System.out.println(" " + slash + "      " + slash1);
            System.out.println(slash + "" + slash2 + "" + slash2 + "" + slash2 + "" + slash2 + slash + slash1 + "" + slash2 + "" + slash2 + slash1);

            /*9. Вывод произведения и суммы цифр числа*/
        short figure = 345;
        int figure1 = figure / 100;
        int figure2 = figure / 10 % 10;
        int figure3 = figure % 10;
            System.out.println("\n9. Вывод произведения и суммы цифр числа");
            System.out.println("Сумма цифр числа 345 = " + (figure1 + figure2 + figure3));
            System.out.println("Их произведение = " + (figure1 * figure2 * figure3));

            /*10. Вывод времени*/
        int sec = 86399;
        int minute = sec / 60 % 60;
        int hour = sec / 3600;
            System.out.println("\n10. Вывод времени");
            System.out.println( hour + ":" + minute + ":" + (sec / 1 % 60));
    }
}