import java.util.Scanner;

public class GuessNumber {

    private boolean result;
    private boolean resultOne = false;
    private boolean resultTwo = false;
    private int randomNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        randomNumber = (int) (Math.random() * 101);
        do {
            System.out.print(playerOne.getName() + ", ведите число: ");
            resultOne = compareNumber(scanner.nextInt());
            if (resultOne) {
                break;
            }
            System.out.print(playerTwo.getName() + ", введите число: ");
            resultTwo = compareNumber(scanner.nextInt());
        } while (!compareNumber(scanner.nextInt()));
    }

    private boolean compareNumber(int number) {
        result = false;
        if (number == randomNumber) {
            System.out.println("Поздравляю, число угадано!");
            result = true;
        } else if (number > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return result;
    }
}
