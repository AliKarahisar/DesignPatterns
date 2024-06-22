public class Main {
    public static void main(String[] args) {
        IRestaurantFactory factory = new OurRestaurantFactory();
        IFood food = factory.createFood("Hamburger");
        IDrink drink = factory.createDrink("Soda");

        System.out.println("You ordered a " + food.getName() + " and a " + drink.getName());
        System.out.println("Ingredients of the food in your order: " + food.getIngredients());
        System.out.println("Volume of the drink in your order: " + drink.getVolume());
        System.out.println("The total cost is $" + (food.getPrice() + drink.getPrice()));
    }
}
