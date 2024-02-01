import java.util.TreeMap;
import java.util.Map;

public class FruitsInventory {
    public static void main(String[] args) {

        // Using TreeMap to store fruits and their quantity
        Map<String, Integer> fruits = new TreeMap<>();
        fruits.put("Melon", 1);
        fruits.put("Mango", 3);
        fruits.put("Peach", 5);
        fruits.put("Lemon", 2);

        System.out.println("Fruits Inventory:");
        System.out.println(fruits);

        // Retrieving the elements by key
        System.out.println("The quantity of Melon is: " + fruits.get("Melon"));
        System.out.println("The quantity of Mango is: " + fruits.get("Mango"));
        System.out.println("The quantity of Peach is: " + fruits.get("Peach"));
        System.out.println("The quantity of Lemon is: " + fruits.get("Lemon"));
    }
}
