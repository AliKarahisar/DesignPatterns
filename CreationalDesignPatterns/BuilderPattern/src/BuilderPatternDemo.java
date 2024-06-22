public class BuilderPatternDemo {
    public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        CarDirector director = new CarDirector(sportsCarBuilder);
        Car sportsCar = director.constructSportsCar();
        System.out.println(sportsCar);
    }
}