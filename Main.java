public class Main {
    public static void main(String[] args) {
        Car[] objects = new Car[3];
        objects[0] = createObject("2й");
        objects[1] = createObject("3й");
        objects[2] = createObject("4й");
        for (Car object : objects) {
            if (object instanceof Printable) {
                Printable printableObject = (Printable) object;
                printableObject.print();
            }
        }
    }
    public static Car createObject(String className) {
        switch (className) {
            case "2й":
                return new Bugatti("Divo", 2000, Color.BLUE, 360, 200.000);
            case "3й":
                return new BMW("X7", 2003, Color.BLACK, 400, 400.000);
            case "4й":
                return new Toyota("Camry", 2005, Color.GREY, 3000, 350.000);
            default:
                return null;
        }
    }
}