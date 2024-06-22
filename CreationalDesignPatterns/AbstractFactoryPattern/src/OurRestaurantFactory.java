public class OurRestaurantFactory implements IRestaurantFactory{
    //Concrate Factory
    public IFood createFood(String foodType) {
        switch (foodType) {
            case "Hamburger":
                return new Hamburger();
            case "HotDog":
                return new HotDog();
            default:
                throw new IllegalArgumentException("Invalid food type: " + foodType);
        }
    }

    public IDrink createDrink(String drinkType) {
        switch (drinkType) {
            case "Soda":
                return new Soda();
            case "Juice":
                return new Juice();
            default:
                throw new IllegalArgumentException("Invalid drink type: " + drinkType);
        }
    }
}
