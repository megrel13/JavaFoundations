package oop;

public class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int countNameSymbols() {
        return name.length();
    }
}
