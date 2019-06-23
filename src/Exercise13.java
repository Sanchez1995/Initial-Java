public class Exercise13 {
    public static void main(String[] args) {
        boolean playerPicked = false;
        int players = 1;
        String noOfPlayers;

        do {
            System.out.println("-----Main Menu-----");
            System.out.println("Option 1: One Player");
            System.out.println("Option 2: Two Player");

            switch (players) {
                case 1:
                    noOfPlayers = "One Player";
                    break;
                case 2:
                    noOfPlayers = "Two Players";
                    break;
                default:
                    noOfPlayers = "Invalid Number of Players please pick between 1 and 2";
                    break;

            }
            System.out.println(noOfPlayers);

            if (true) {
                playerPicked = true;
            }
        } while (playerPicked == false);
    }
}