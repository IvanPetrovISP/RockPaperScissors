public class Scores {
    private int player = 0;
    private int computer = 0;
    private int tie = 0;

    public void scorePlayer() {
        this.player++;
    }

    public void scoreComputer() {
        this.computer++;
    }

    public int getPlayer() {
        return player;
    }

    public int getComputer() {
        return computer;
    }

    public int getTie() {
        return tie;
    }

    public void scoreTie() {
        this.tie++;
    }
}
