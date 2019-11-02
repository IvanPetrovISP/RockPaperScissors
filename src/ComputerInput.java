import java.util.Random;

public class ComputerInput {
    private String input;


    private void setInput() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                this.input = "r";
                break;
            case 1:
                this.input = "p";
                break;
            case 2:
                this.input = "s";
                break;
        }
    }

    public String getInput() {
        this.setInput();
        return input;
    }

    public boolean isRock() {
        return this.input.equals("r");
    }

    public boolean isPaper() {
        return this.input.equals("p");
    }

    public boolean isScissors() {
        return this.input.equals("s");
    }
}
