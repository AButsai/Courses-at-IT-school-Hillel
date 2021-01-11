package ua.butsai.homework17.carpet;

public class Floor {
    private double width;
    private double length;

    public Floor(double w, double l) {
        if (w < 0) {
            this.width = 0;
        } else if (l < 0) {
            this.length = 0;
        } else {
            this.width = w;
            this.length = l;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }
}
