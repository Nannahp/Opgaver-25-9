package mycards;

import trafficlights.TestLights;

public class TestMyCard {
    public static void main(String[] args) {
        new TestMyCard().run();
    }

    private void run() {
        MyCard card1 = new MyCard(CardType.HEART, 13);
        System.out.println(card1.getType());
        System.out.println(card1.getValue());
    }
}
