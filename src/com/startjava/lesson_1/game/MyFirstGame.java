public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        int playerNumber = 50;
        while (playerNumber != randomNumber) {
            if (playerNumber > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber--;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}
