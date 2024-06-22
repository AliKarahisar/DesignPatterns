public interface IRestaurantFactory {
    //Abstract Factory
    IFood createFood(String foodType);
    IDrink createDrink(String drinkType);
}
