package Actividad3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        // Inicializar el deck con todas las cartas
        for (String palo : palos) {
            for (String color : colores) {
                for (String valor : valores) {
                    cards.add(new Card(palo, color, valor));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public Card head() {
        if (cards.isEmpty()) {
            System.out.println("No quedan cartas en el Deck.");
            return null;
        }

        Card card = cards.remove(0);
        System.out.println(card.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return card;
    }

    public Card pick() {
        if (cards.isEmpty()) {
            System.out.println("No quedan cartas en el Deck.");
            return null;
        }

        int randomIndex = (int) (Math.random() * cards.size());
        Card card = cards.remove(randomIndex);
        System.out.println(card.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return card;
    }

    public List<Card> hand() {
        List<Card> hand = new ArrayList<>();
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas para repartir una mano.");
            return hand;
        }

        for (int i = 0; i < 5; i++) {
            Card card = cards.remove(0);
            hand.add(card);
        }

        for (Card card : hand) {
            System.out.println(card.toString());
        }

        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return hand;
    }
}