public class PlayerInput {
    private String input;

    public void set(String input) {
        this.input = input;
    }

    public boolean validate(String input){
        return (input.toLowerCase().equals("r") || input.toLowerCase().equals("p") || input.toLowerCase().equals("s"));
    }

    public boolean isRock(){
        return this.getInput().toLowerCase().equals("r");
    }

    public boolean isPaper(){
        return this.getInput().toLowerCase().equals("p");
    }

    // not used
    //public boolean isScissors(){
    //    return this.getInput().toLowerCase().equals("s");
    //}

    public String getInput() {
        return input;
    }
}
