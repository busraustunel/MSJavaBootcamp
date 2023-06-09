package Java01.godoro.sports;

public class Player {
    private int playerId;
    private String playerName;

    private double averageScore;
    private Team team;

    public Player(int playerId, String playerName, double averageScore) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.averageScore = averageScore;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
