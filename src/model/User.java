package model;

public class User {
    String firstName;
    String surName;
    String patronymic;
    String dateOfBirth;
    int telephonNumber;
    String sex;
    public User (String surName, String firstName, String patronymic, String dateOfBirth, int telephonNumber, String sex) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.telephonNumber = telephonNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(surName);
        sb.append(" ");
        sb.append(patronymic);
        sb.append(" ");
        sb.append(dateOfBirth);
        sb.append(" ");
        sb.append(telephonNumber);
        sb.append(" ");
        sb.append(sex);
        sb.append("\n");
        return sb.toString();
    }

    public String getSurName() {
        return surName;
    }
}
