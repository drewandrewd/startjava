public class Player extends GuessNumber{

    private String playerName;
    private int number;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public Player(String playerName) {
        this.playerName = playerName;
    }
}
