import java.util.Scanner;

public class GuessNuberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player playerOne = new Player(scanner.nextLine());
        Player playerTwo = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        String yesNo = "yes";

        while (yesNo.equals("yes")) {
            game.playGame();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                yesNo = scanner.next();
            }
            while (!yesNo.equals("no") && !yesNo.equals("yes"));
        }
    }
}
