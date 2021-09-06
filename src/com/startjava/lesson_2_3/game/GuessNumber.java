

import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        boolean comparisonResult;
        randomNumber = (int) (Math.random() * 101);
        do {
            comparisonResult = compareNumbers(inputNumber(playerOne));
            if (comparisonResult) {
                break;
            }
            comparisonResult = compareNumbers(inputNumber(playerTwo));
        } while (!comparisonResult);
    }

    private int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        return scanner.nextInt();
    }

    private boolean compareNumbers(int number) {
        if (number == randomNumber) {
            System.out.println("Поздравляю, число угадано!");
            return true;
        } else if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }
}
