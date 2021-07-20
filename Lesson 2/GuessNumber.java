public class GuessNumber {

    boolean result;
    public boolean playNumber(int playerNumber, int randomNumber) {

        if (playerNumber > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            result = false;
        } else if (playerNumber < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            result = false;
        } else if (playerNumber == randomNumber) {
            System.out.println("Поздравляю, число угадано!");
            result = true;
        }
        return result;
    }
}
