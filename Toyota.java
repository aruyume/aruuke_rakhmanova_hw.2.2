public class Toyota extends Car implements Printable {
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Toyota(String model, int year, Color color,int fuel, double price) {
        super(model, year, color, price);
        this.fuel = fuel;
    }

    @Override
    public void print() {
        System.out.println("\nToyota: " + getModel() +
                "\nYear: " + getYear() +
                "\nFuel: " + getFuel() +
                "\nColor: " + getColor() +
                "\nPrice: " + getPrice());
    }
}
