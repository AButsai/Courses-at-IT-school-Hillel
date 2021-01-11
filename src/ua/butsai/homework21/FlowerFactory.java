package ua.butsai.homework21;

public class FlowerFactory {
    private double countTulip = 0, countRouse = 0, countClove = 0, countPeony = 0, countChamomile = 0;

    Tulip tulip = new Tulip();
    Rouse rouse = new Rouse();
    Clove clove = new Clove();
    Peony peony = new Peony();
    Chamomile chamomile = new Chamomile();

    public Flower getFlower(FlowerTypes type) {
        Flower toReturn = null;
        switch (type) {
            case TULIP:
                countTulip++;
                toReturn = new Tulip();
                break;
            case ROUSE:
                countRouse++;
                toReturn = new Rouse();
                break;
            case CLOVE:
                countClove++;
                toReturn = new Clove();
                break;
            case PEONY:
                countPeony++;
                toReturn = new Peony();
                break;
            case CHAMOMILE:
                countChamomile++;
                toReturn = new Chamomile();
        }
        return toReturn;
    }

    public double getCostFlowers() {
        return ((countTulip * tulip.getCost()) + (countRouse * rouse.getCost()) +
                (countClove * clove.getCost()) + (countPeony * peony.getCost()) +
                (countChamomile * chamomile.getCost()));
    }
}
