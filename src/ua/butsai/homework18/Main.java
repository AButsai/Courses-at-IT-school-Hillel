package ua.butsai.homework18;

public class Main {
    /**
     * Задание 1.
     *
     * Swimming Company попросила вас написать приложение, которое рассчитывает объем бассейнов в форме кубов.
     *
     * 1. Напишите класс с именем Rectangle. Классу нужны два поля (переменная экземпляра) с именами width и length типа double.
     * Класс должен иметь один конструктор с параметрами width и length типа double и инициализировать поля.
     * Если параметр ширины меньше 0, необходимо установить значение поля ширины в 0.
     * Если параметр длины меньше 0, необходимо установить значение поля длины в 0.
     *
     * Напишите следующие методы (методы экземпляра):
     * Метод с именем getWidth без каких-либо параметров, он должен возвращать значение поля ширины.
     * Метод с именем getLength без каких-либо параметров, он должен возвращать значение поля длины.
     * Метод с именем getArea без каких-либо параметров, он должен возвращать вычисленную площадь (ширина * длина).
     *
     * 2. Напишите класс с именем Cuboid, расширяющий класс Rectangle.
     * Классу нужно одно поле (переменная экземпляра) с именем height (высота) типа double.
     * Класс должен иметь один конструктор с тремя параметрами width, length и height типа double.
     * Необходимо вызвать родительский конструктор и инициализировать поле высоты.
     * Если параметр высоты меньше 0, необходимо установить значение поля высоты в 0.
     *
     * Напишите следующие методы (методы экземпляра):
     * Метод с именем getHeight без каких-либо параметров, он должен возвращать значение поля высоты.
     * Метод с именем getVolume без каких-либо параметров, он должен вернуть рассчитанный объем.
     * Для расчета объема умножьте площадь на высоту.
     *
     * TEST CODE:
     *
     * Rectangle rectangle = new Rectangle(5, 10);
     * System.out.println("rectangle.width= " + rectangle.getWidth());
     * System.out.println("rectangle.length= " + rectangle.getLength());
     * System.out.println("rectangle.area= " + rectangle.getArea());
     * Cuboid cuboid = new Cuboid(5,10,5);
     * System.out.println("cuboid.width= " + cuboid.getWidth());
     * System.out.println("cuboid.length= " + cuboid.getLength());
     * System.out.println("cuboid.area= " + cuboid.getArea());
     * System.out.println("cuboid.height= " + cuboid.getHeight());
     * System.out.println("cuboid.volume= " + cuboid.getVolume());
     *
     * → OUTPUT
     *
     * rectangle.width= 5.0
     * rectangle.length= 10.0
     * rectangle.area= 50.0
     * cuboid.width= 5.0
     * cuboid.length= 10.0
     * cuboid.area= 50.0
     * cuboid.height= 5.0
     * cuboid.volume= 250.0
     * @param args
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
