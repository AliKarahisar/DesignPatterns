public interface CarBuilder {
    void setEngine(String engine);
    void setWheels(int wheels);
    void setInterior(String interior);
    void setColor(String color);
    Car build();
}