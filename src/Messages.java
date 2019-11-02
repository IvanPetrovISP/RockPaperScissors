public class Messages {
    public void greetings(){
        System.out.println("How many rounds would you like to play?");
    }

    public void wrongInput(){
        System.out.println("Wrong input!");
    }

    public void tie(){
        System.out.println("Round ends in Tie!");
    }

    public void roundWin(){
        System.out.println("You win this round!");
    }

    public void roundLoss(){
        System.out.println("You lost this round!");
    }

    public void gameResults(int rounds) {
        System.out.printf("Rounds played: %d%n", rounds);
    }

    public void roundsWon(int player) {
        System.out.printf("Rounds you won: %d%n", player);
    }

    public void roundsLost(int computer) {
        System.out.printf("Rounds you lost: %d%n", computer);
    }

    public void roundsTie(int tie) {
        System.out.printf("Rounds in tie: %d%n", tie);
    }

    public void announcePlayer() {
        System.out.println("You won the game!");
    }

    public void announceComputer() {
        System.out.println("You lost the game!");
    }

    public void announceTie() {
        System.out.println("Nobody won the game!");
    }

    public void rules() {
        System.out.println("Type 'r' for Rock, 'p' for Paper or 's' for Scissors!");
    }

    public void announceMoves(String computer) {
        String result = "";
        if (computer.equals("r")){
            result = "rock";
        } else if (computer.equals("p")){
            result = "paper";
        } else {
            result = "scissors";
        }
        System.out.printf("The Computer played %s!%n", result);
    }

    public void separator() {
        System.out.println("===============================");
    }
}