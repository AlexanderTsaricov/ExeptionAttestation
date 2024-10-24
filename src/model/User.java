package model;

public class User {
    String firstName;
    String surName;
    String patronymic;
    String dateOfBirth;
    int telephonNumber;
    String sex;
    public User (String firstName, String surName, String patronymic, String dateOfBirth, int telephonNumber, String sex) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.telephonNumber = telephonNumber;
        this.sex = sex;
    }
}
