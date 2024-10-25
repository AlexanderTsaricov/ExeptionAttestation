package presenter;

import model.Checks;
import model.SaveInFile;
import model.User;

import java.io.IOException;

public class Presenter {
    Checks cheks;
    User user;
    SaveInFile save;
    public Presenter () {
        cheks = new Checks();
        SaveInFile SaveInFile = new SaveInFile();
    }
    public boolean checkCount (String[] arr) {
        return cheks.countInputDataCheck(arr);
    }

    public boolean sexCheck (String sex) {
        return cheks.sexCheck(sex);
    }

    public boolean dateOfBirthCheck(String data) {
        return cheks.dataCheck(data);
    }

    private void createUser (String[] arrStr) {
        user = new User(arrStr[0], arrStr[1], arrStr[2], arrStr[3], Integer.parseInt(arrStr[4]), arrStr[5]);
    }

    public void save (String[] arrStr) throws IOException {
        createUser(arrStr);
        save.save(user.toString(), user.getSurName());
    }
}
