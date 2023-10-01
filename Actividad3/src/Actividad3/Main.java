package Actividad3;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Mezclar el Deck
        deck.shuffle();

        // Mostrar la primera carta
        deck.head();

        // Seleccionar una carta al azar
        deck.pick();

        // Repartir una mano
        deck.hand();
    }
}