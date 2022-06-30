import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        TerminalColors consoleColor = new TerminalColors();
        System.out.println(consoleColor.BLACK+consoleColor.BRIGHT_YELLOW_BACKGROUND+ "HalLo Welt"+ consoleColor.RESET_TERMINAL);
        Path path = new File("dgdfgdf").toPath();


       InputManger manager = new InputManger();
       manager.getUserPath();


    }
}
