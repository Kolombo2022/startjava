public class MyFirstGame {

    public static void main(String[] args) {
        int myNumber = 15;
        int anyNumber = 20;
        if (myNumber > 0 && myNumber <= 100) {
            while (myNumber != anyNumber) {
                if (myNumber < anyNumber) {
                    System.out.println("число " + myNumber + " меньше того, что загадал компьютер");
                    myNumber++;
                }
                if (myNumber > anyNumber) {
                    System.out.println("число " + myNumber + " больше того, что загадал компьютер");
                    myNumber--;
                }
            }
            System.out.println("Бинго! Это число " + myNumber);
        } else {
            System.out.println("Введите целое число в интервале (0, 100]");
        }
    }
}