package model;
import java.io.FileWriter;
import java.io.IOException;

public class SaveInFile {
    public void save (String saveData, String surname) throws IOException {

        FileWriter fw = new FileWriter(surname + ".txt", true);
        fw.write(saveData);
        fw.write("\n");
        fw.close();
    }
}
