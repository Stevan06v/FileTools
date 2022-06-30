import java.util.regex.*;
public class InputChecker {
    public String getInput;

    public InputChecker(String getInput) {
        this.getInput = getInput;
    }

    public boolean checkIfCharExists(char c){
        for (int i = 0; i < this.getInput.length(); i++) {
            if(this.getInput.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

    // redo: is absolute path
    public boolean isAbsolutePath(){
        return Pattern.matches("([a-zA-Z]:)?(\\\\\\\\[a-zA-Z0-9_.-]+)+\\\\\\\\?", this.getInput);
    }
}
