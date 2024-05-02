import java.util.Random;
public class we9 {
    public static void main(String[] args) {
        
        Random random = new Random();

        int totalGames = 1000000; 
        int wins = 0;

        for (int i = 0; i < totalGames; i++) {
           
            int card1 = random.nextInt(101);
            int card2 = random.nextInt(101);

        
            int selectedCard = random.nextInt(2) == 0 ? card1 : card2;

            
            int randomNum = random.nextInt(101);

           
            if (randomNum >= selectedCard) {
                wins++; // Bob wins if the random number is greater than or equal to the selected card
            }
        }


        double winRate = (double) wins / totalGames;

 
        System.out.println("Bob's win rate: " + winRate);
    }
}
