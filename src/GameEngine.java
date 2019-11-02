import java.util.Scanner;

public class GameEngine {
    Scanner scanner = new Scanner(System.in);
    Messages message = new Messages();
    RequestRounds rounds = new RequestRounds();
    PlayerInput player = new PlayerInput();
    ComputerInput computer = new ComputerInput();
    Scores scores = new Scores();

    public void run() {
        start();
        play();
        finish();
    }

    private void start() {
        message.greetings();

        validateRounds();
    }

    private void validateRounds() {
        while (!scanner.hasNextInt()){
            message.wrongInput();
            scanner.nextLine();
        }

        int roundsCount = Integer.parseInt(scanner.nextLine());
        while (roundsCount <= 0) {
            message.wrongInput();
            roundsCount = Integer.parseInt(scanner.nextLine());
        }
        rounds.setRounds(roundsCount);
    }

    private void play() {
        message.rules();
        for (int i = 1; i <= rounds.getRounds(); i++) {
            String playerInput = scanner.nextLine();

            while (!player.validate(playerInput)) {
                message.wrongInput();
                playerInput = scanner.nextLine();
            }

            player.set(playerInput);
            computer.getInput();
            message.announceMoves(computer.getInput());
            compare(player, computer);
        }
    }

    private void compare(PlayerInput player, ComputerInput computer) {
        if (player.isRock()) {
            if (computer.isRock()) {
                scores.scoreTie();
                message.tie();
            } else if (computer.isScissors()) {
                scores.scorePlayer();
                message.roundWin();
            } else {
                scores.scoreComputer();
                message.roundLoss();
            }
        } else if (player.isPaper()) {
            if (computer.isPaper()) {
                scores.scoreTie();
                message.tie();
            } else if (computer.isRock()) {
                scores.scorePlayer();
                message.roundWin();
            } else {
                scores.scoreComputer();
                message.roundLoss();
            }
        } else {
            if (computer.isScissors()) {
                scores.scoreTie();
                message.tie();
            } else if (computer.isPaper()) {
                scores.scorePlayer();
                message.roundWin();
            } else {
                scores.scoreComputer();
                message.roundLoss();
            }
        }
    }

    private void finish() {
        separator();
        roundsInfo();
        playerInfo();
        computerInfo();
        tieInfo();
        announceWinner();
    }

    private void separator() {
        message.separator();
    }

    private void roundsInfo() {
        message.gameResults(rounds.getRounds());
    }

    private void playerInfo() {
        message.roundsWon(scores.getPlayer());
    }

    private void computerInfo() {
        message.roundsLost(scores.getComputer());
    }

    private void tieInfo() {
        if (scores.getTie() != 0) {
            message.roundsTie(scores.getTie());
        }
    }

    private void announceWinner() {
        if (scores.getPlayer() > scores.getComputer()) {
            message.announcePlayer();
        } else if (scores.getPlayer() < scores.getComputer()) {
            message.announceComputer();
        } else {
            message.announceTie();
        }
    }

}