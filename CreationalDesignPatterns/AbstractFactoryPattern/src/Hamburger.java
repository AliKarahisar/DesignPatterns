import java.util.Arrays;
import java.util.List;

public class Hamburger implements IFood{
    // Concrete Product
    public String getName() {
        return "Hamburger";
    }

    public double getPrice() {
        return 5.99;
    }

    public List<String> getIngredients() {
        return Arrays.asList("beef", "lettuce", "tomato", "onion");
    }
}
