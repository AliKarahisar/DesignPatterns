public class Car {
    private String engine;
    private int wheels;
    private String interior;
    private String color;

    public Car(String engine, int wheels, String interior, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.interior = interior;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", interior=" + interior + ", color=" + color + "]";
    }
}