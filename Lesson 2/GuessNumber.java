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
            System.out.print(playerOne.getName() + ", ведите число: ");
            comparisonResult = compareNumbers(getNumbers());
            if (comparisonResult) {
                break;
            }
            System.out.print(playerTwo.getName() + ", введите число: ");
            comparisonResult = compareNumbers(getNumbers());
        } while (!comparisonResult);
    }

    private boolean compareNumbers(int number) {
        if (number == randomNumber) {
            System.out.println("Поздравляю, число угадано!");
            return true;
        } else if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        }
    }

    private int getNumbers() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
