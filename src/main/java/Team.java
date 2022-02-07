/**
 *
 * @author Delron Chad Claassen
 * @studentNumber 219360561
 */
public class Team {

    private String name;
    private int gamesWon, gamesLost, gamesTied;

    public Team (){
    }
    public Team(String name, int gamesWon, int gamesLost, int gamesTied) {
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesTied = gamesTied;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return this.gamesWon;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesLost() {
        return this.gamesLost;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }

    public int getGamesTied() {
        return this.gamesTied;
    }

    @Override
    public String toString() {
        String str = String.format("Name: %s\nWon: %d\nLost: %d\nTied: %d", this.name, this.gamesWon, this.gamesLost, this.gamesTied);
        return str;
    }
}