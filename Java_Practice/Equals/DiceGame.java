import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for entering the three numbers
        System.out.println("Enter any three numbers between 1 to 6 : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        String ch = "";

        // Roll the dice
        System.out.println("You need to roll the dice thrice, type roll to roll the dice : ");
        sc.nextLine();
        ch = sc.nextLine();
        int roll1 = 0, roll2 = 0, roll3 = 0;

        if (ch.equals("roll"))
            roll1 = (int) (Math.random() * 6 + 1);
        System.out.println("The number on dice is " + roll1);
        System.out.println("You need to roll the dice thrice, type roll to roll the dice : ");

        ch = sc.nextLine();

        if (ch.equals("roll"))
            roll2 = (int) (Math.random() * 6 + 1);
        System.out.println("The number on dice is " + roll2);
        System.out.println("You need to roll the dice thrice, type roll to roll the dice : ");

        ch = sc.nextLine();

        if (ch.equals("roll"))
            roll3 = (int) (Math.random() * 6 + 1);
        System.out.println("The number on dice is " + roll3);

        // Computing the sum to check the winning conditions
        int sum1 = a + b + c;
        int sum2 = roll1 + roll2 + roll3;
        if (sum2 < sum1 && Math.abs(sum1 - sum2) < 3)
            System.out.println("You won");
        else
            System.out.println("You lost");

        sc.close();
    }
}