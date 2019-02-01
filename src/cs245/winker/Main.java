package cs245.winker;



public class Main {

    public static void main(String[] args) {
        int winCount = 0;
        int lossCount = 0;
        double percentageWon = 0.0;


        for (int i = 0; i < 100000; i++) {
            CrapsGame mycraps = new CrapsGame();
            if (mycraps.play()) {   // Win
                winCount++;
            }
            else {                  // Lose
                lossCount++;
            }
        }
        percentageWon = 100 * (winCount / (double)(winCount + lossCount));
        String result = String.format("%.2f", percentageWon);
        System.out.println("Win percentage:  " + result + "%");
    }
}
