public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSportsCar() {
        builder.setEngine("V8 Engine");
        builder.setWheels(4);
        builder.setInterior("Leather");
        builder.setColor("Red");
        return builder.build();
    }
}