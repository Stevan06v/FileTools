import java.nio.file.Path;
import java.util.Collection;
import java.io.*;

public class FileManager {

    //Path to work with
    private static Path filePath;
    private static InputManger inputmanager;



    //run the program
    public void run(){
        inputmanager = new InputManger();

        inputmanager.getUserPath();


    }


}
