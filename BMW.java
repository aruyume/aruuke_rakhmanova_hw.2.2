public class BMW extends Car implements Printable {
    private int enginePower;

    public int getEnginePower() {
        return enginePower;
    }

    public BMW(String model, int year, Color color,int enginePower, double price) {
        super(model, year, color, price);
        this.enginePower = enginePower;
    }

    @Override
    public void print() {
        System.out.println("\nBMW: " + getModel() +
                "\nYear: " + getYear() +
                "\nEngine Power: " + getEnginePower() +
                "\nColor: " + getColor() +
                "\nPrice: " + getPrice());
    }
}
