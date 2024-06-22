import java.util.Arrays;
import java.util.List;

public class HotDog implements IFood{
    // Concrete Product
    public String getName() {
        return "Hot Dog";
    }

    public double getPrice() {
        return 3.99;
    }

    public List<String> getIngredients() {
        return Arrays.asList("beef", "bun", "mustard", "ketchup");
    }
}
