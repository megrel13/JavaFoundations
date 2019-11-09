package oop;

public class Man {
    private String name;
    private boolean isMan;
    public  static String surname;

    public Man() {

    }
    public Man(String name) {
        this();
        this.name = name;
    }

    public Man(String name, boolean isMan) {
        this.name = name;
        this.isMan = isMan;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
}
