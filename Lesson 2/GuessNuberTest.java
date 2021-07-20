import java.util.Scanner;

public class GuessNuberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player playerOne = new Player(scanner.nextLine());
        Player playerTwo = new Player(scanner.nextLine());
        boolean resultOne = false;
        boolean resultTwo = false;
        boolean answer = true;
        while (answer) {
            int randomNumber = (int) (Math.random() * 101);
            while (!resultOne || !resultTwo) {
                System.out.print(playerOne.getPlayerName() + ": ");
                resultOne = playerOne.playNumber(scanner.nextInt(), randomNumber);
                if (resultOne == true) {
                    break;
                } else {
                    System.out.print(playerTwo.getPlayerName() + ": ");
                    resultTwo = playerTwo.playNumber(scanner.nextInt(), randomNumber);
                }
            }
            boolean wrongAnswer = true;
            while (wrongAnswer) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                String yesNo = scanner.next();
                if (yesNo.equals("yes")) {
                    answer = true;
                    wrongAnswer = false;
                } else if (yesNo.equals("no")) {
                    answer = false;
                    wrongAnswer = false;
                } else {
                    wrongAnswer = true;
                }
            }
        }

    }
}
