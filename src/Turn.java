public class Turn {
    //Declaring variables
    static int userScore = 0;
    static int machineScore = 0;

    //Method that controls the users turn
    public static void userThrow() {
        userScore += (int) (Math.random() * 11) + 1;
        System.out.println("You have: " + userScore);

        if (userScore > 21) {
            System.out.println("\nYou lose! better luck next time!");
            Blackjack.gameContinue = false;
        } else if (userScore == 21) {
            System.out.println("\nYou got Blackjack!! Congratulations, you have won!");
            Blackjack.gameContinue = false;
        }
    }

    //Method that controls the machines turn
    public static void machineThrow() {
        System.out.println("The turn goes to the machine!");

        while (machineScore < 16) {
            machineScore += (int) (Math.random() * 11) + 1;

            if (machineScore > 21) {
                System.out.println("\nThe machine has: " + machineScore + " and you have: " + userScore);
                System.out.println("You have won! Congratulations!");
                Blackjack.gameContinue = false;
            } else if (machineScore >= userScore && machineScore >= 16) {
                System.out.println("\nThe machine has: " + machineScore + " and you have: " + userScore);
                System.out.println("You lose! better luck next time!");
                Blackjack.gameContinue = false;
            } else if (machineScore < userScore && machineScore >= 16) {
                System.out.println("\nThe machine has: " + machineScore + " and you have: " + userScore);
                System.out.println("You have won! Congratulations!");
                Blackjack.gameContinue = false;
            }
        }
    }
}
