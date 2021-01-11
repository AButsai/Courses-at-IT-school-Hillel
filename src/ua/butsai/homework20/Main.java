package ua.butsai.homework20;

/**
 * UML диаграмма в папке res//FlightTicket.png
 *
 * Создать программу по UML диаграмме.
 * На диаграмме пунктирные линии означают зависимость. Пока на них не обращайте внимания.
 * Главное - это сплошные линии (композиция) и синяя линия (наследование).
 *
 * Пример main метода
 *
 * public static void main(String[] args) {
 *     Passenger pasPetrov = new Passenger("Василий", "Петров", 123456);
 *     Passenger pasSidorov = new Passenger("Саша", "Сидоров", 654321);
 *
 *     FlightInfo flightFromKyivToParis = new FlightInfo(23675, "Киев", "Париж", 12.30, 1000);
 *
 *     Ticket t1 = new Ticket(7, flightFromKyivToParis, pasPetrov);
 *     Ticket t2 = new VipTicket(2,flightFromKyivToParis,pasSidorov,new Meal(Menu.DESSERT, Drinks.YES),new Baggage(2, 20));
 *
 *     System.out.println(t1 + "\n" + t1.getCost());
 *     System.out.println(t2 + "\n" + t2.getCost());
 * }
 *
 * Пример вывода в консоли:
 *
 * Ticket{sitNumber=7, flightInfo=FlightInfo{flightNumber=23675, departure='Киев', destination='Париж', time=12.3}, passengerInfo=PassengerInfo{name='Василий', lastName='Петров', passport=123456}, ticket price=1000 $ }
 * 1000
 * VipTicket{sitNumber=2, meal=Meal{menu=Menu{var=3, description='Десерт', price=100$}, drinks=Drinks{var=0, description='С напитками', price=50$}, total price=150$}, baggage=Baggage{ amount=2, fee=40 $ }, ticket price=1190 $ }
 * 1190
 */

public class Main {
    public static void main(String[] args) {
        Passenger pasPetrov = new Passenger("Василий", "Петров", 123456);
        Passenger pasSidorov = new Passenger("Саша", "Сидоров", 654321);
        FlightInfo flightFromKyivToParis = new FlightInfo(23675, "Киев", "Париж", 12.30, 1000);
        Ticket t1 = new Ticket(7, flightFromKyivToParis, pasPetrov);
        Ticket t2 = new VipTicket(2, flightFromKyivToParis, pasSidorov, new Meal(Menu.DESSERT, Drinks.YES), new Baggage(2, 20));

        System.out.println(t1 + "\n" + t1.getCost());
        System.out.println(t2 + "\n" + t2.getCost());
    }
}
