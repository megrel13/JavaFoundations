package oop;

public class GameRunner {
    public static void main(String[] args) {
        Game warhammer = new Game("Warhammer");
        System.out.println("Наша игра: " + warhammer.getName());

        String name = "Парфпыаврф";
        warhammer.setName(name);
        System.out.println("Наша игра: " + warhammer.getName());

        int sizeOfWarhammer = warhammer.countNameSymbols();
        System.out.println(sizeOfWarhammer + 10);
    }
}
