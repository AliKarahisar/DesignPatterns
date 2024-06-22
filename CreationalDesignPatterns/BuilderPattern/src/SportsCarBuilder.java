public class SportsCarBuilder implements CarBuilder {
    private String engine;
    private int wheels;
    private String interior;
    private String color;

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Car build() {
        return new Car(engine, wheels, interior, color);
    }
}