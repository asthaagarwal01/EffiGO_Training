import java.util.Scanner;

public class Game {

    // function to take computer choice
    public static String choice(int ans) {
        if (ans == 0)
            return "rock";
        else if (ans == 1)
            return "paper";
        else
            return "scissors";
    }

    // function to decide the winner
    public static void winner(String comp, String option) {
        if (option.equals("rock") && comp.equals("paper"))
            System.out.println("Darn, some other time.");
        else if (option.equals("rock") && comp.equals("scissors"))
            System.out.println("You won");
        else if (option.equals("paper") && comp.equals("scissors"))
            System.out.println("Darn, some other time.");
        else if (option.equals("paper") && comp.equals("rock"))
            System.out.println("You won");
        else if (option.equals("scissors") && comp.equals("rock"))
            System.out.println("Darn, some other time.");
        else if (option.equals("scissors") && comp.equals("paper"))
            System.out.println("You won");
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.\nWhen I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("\nAre you ready? Write 'yes' if you are");
        String choice = sc.nextLine();

        if (choice.equals("yes")) {
            System.out.println("Great!\nrock - paper - scissors, shoot!");
            String option = sc.nextLine();
            int ans = (int) (Math.random() * 1 + 1);
            String comp = choice(ans);

            System.out.println("You chose : " + option + "\n");
            System.out.println("Computer chose : " + comp + "\n");

            winner(comp, option);
        }
        sc.close();
    }
}