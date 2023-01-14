public class MyFirstGame {

    public static void main(String[] args) {
        int playerNumber = 15;
        int targetNum = 20;
        if (playerNumber > 0 && playerNumber <= 100) {
            while (playerNumber != targetNum) {
                if (playerNumber < targetNum) {
                    System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
                    playerNumber++;
                }
                if (playerNumber > targetNum) {
                    System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
                    playerNumber--;
                }
            }
            System.out.println("Бинго! Это число " + playerNumber);
        } else {
            System.out.println("Введите целое число в интервале (0, 100]");
        }
    }
}