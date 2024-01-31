public class Shop {
    public static void main(String[] args) {
        double wallet = 100.0;
        double toy = 20.9;
        double shoes = 150.7;
        System.out.println("Can you buy me this toy ?");

        // Checking the conditions
        if (wallet >= toy) {
            System.out.println("Yes, sure");
            wallet -= toy;
        } else
            System.out.println("No, I can't");
        System.out.println("Can you buy me these shoes ?");
        if (wallet >= shoes) {
            System.out.println("Yes, sure");
            wallet -= shoes;
        } else
            System.out.println("No, I can't");

    }
}