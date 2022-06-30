import java.util.Scanner;

public class InputManger {

    public static TerminalColors terminalColor = new TerminalColors();
    public static Scanner scanner = new Scanner(System.in);
    public static InputChecker inputChecker;
    private String userInput;
    private int pickedFunc;


    public void getUserPath(){
        int counter = 0;
        do{
            if(counter >= 1){
                System.out.print(terminalColor.RED + "Enter an absolute Path: " + terminalColor.RESET_TERMINAL);
                this.userInput =  scanner.nextLine();
                inputChecker = new InputChecker(userInput);
            }else {
                System.out.print("Enter an absolute Path: ");
                this.userInput =  scanner.nextLine();
                inputChecker = new InputChecker(userInput);
                counter++;
            }
        }while(inputChecker.getInput == "");
    }



    public String filterChars(char filterChar) {
        String filteredSTRING = "";
        inputChecker = new InputChecker(this.userInput);
        if (inputChecker.checkIfCharExists('c')) {
            for (int i = 0; i < this.userInput.length() - 1; i++) {
                if (this.userInput.charAt(i) == filterChar) {
                    filteredSTRING += this.userInput.charAt(i);
                }
            }
        }else{
            return filteredSTRING;
        }
        return filteredSTRING;
    }

    //get file name of absolute path
    public String getTargetName() {
        String targetName = "";
            if (this.userInput.charAt(0) == '"') {
                this.userInput = filterChars('"');
            }
            String backSlash = "\\";
            for (int i = this.userInput.length() - 1; i > 0; i--) {
                // backslash found --> stop
                if (this.userInput.charAt(i) == backSlash.charAt(0)) {
                    // start at backslash and print until end
                    for (int j = i + 1; j < this.userInput.length(); j++) {
                        targetName += this.userInput.charAt(j);
                    }
                    break;
                }
            }
            return targetName;
    }




    public String getUserInput() {
        return userInput;
    }

    public int getPickedFunc() {
        return pickedFunc;
    }
}
