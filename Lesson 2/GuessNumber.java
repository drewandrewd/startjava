import java.util.Scanner;

public class GuessNumber {

    boolean result;
    boolean resultOne = false;
    boolean resultTwo = false;
    int randomNumber;
    Player playerOne;
    Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public boolean playNumber(int number, int randomNumber) {

        if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            result = false;
        } else if (number < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            result = false;
        } else if (number == randomNumber) {
            System.out.println("Поздравляю, число угадано!");
            result = true;
        }
        return result;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        randomNumber = (int) (Math.random() * 10);
        do {
            System.out.print(playerOne.getPlayerName() + ": ");
            resultOne = playNumber(scanner.nextInt(), randomNumber);
            if (resultOne == true) {
                break;
            } else {
                System.out.print(playerTwo.getPlayerName() + ": ");
                resultTwo = playNumber(scanner.nextInt(), randomNumber);
            }
        } while (!resultOne && !resultTwo);
    }


}
