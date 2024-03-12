public class Car {
    private String model;
    private int year;
    private Color color;
    private double price;

    public Car(String model, int year, Color color, double price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }
}
