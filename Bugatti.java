public class Bugatti extends Car implements Printable {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public Bugatti(String model, int year, Color color, int speed, double price) {
        super(model, year, color, price);
        this.speed = speed;
    }

    @Override
    public void print() {
        System.out.println("\nBugatti: " + getModel() +
                "\nYear: " + getYear() +
                "\nSpeed: " + getSpeed() +
                "\nColor: " + getColor() +
                "\nPrice: " + getPrice());
    }
}
