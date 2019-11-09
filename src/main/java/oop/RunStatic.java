package oop;

public class RunStatic {
    public static void main(String[] args) {
       Man name = new Man();
       Man maxim = new Man("Maxim");
       maxim.setSurname("Каяткин");
       Man vova = new Man("Vova");
       vova.setSurname("Merzlov");
        System.out.println(maxim.getSurname());
        System.out.println(vova.getSurname());
    }

}
