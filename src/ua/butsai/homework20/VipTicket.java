package ua.butsai.homework20;

public class VipTicket extends Ticket {

    private Meal meal;
    private Baggage baggage;

    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;

    }

    public int getCost() {
        return meal.getPrice() + baggage.getFee() + super.getCost();
    }

    @Override
    public String toString() {
        return "VipTicket{" + "sitNumber=" + super.getSitNumber() + ", " + "meal=" + meal + ", baggage=" + baggage + ",  ticket price=" + getCost() +  '}';
    }
}
