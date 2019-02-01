package cs245.winker;

public class CrapsGame {
    private Dice dice1;
    private Dice dice2;
    private boolean firstThrow;
    private int point;
    private int outcome;
    private boolean isFinished = false;
    private boolean isWin;

    private int roll() {
        return dice1.rollDie() + dice2.rollDie();
    }

    public CrapsGame() {
        dice1 = new Dice();
        dice2 = new Dice();
        firstThrow = true;
    }

    public boolean play() {
        while (!isFinished) {
            outcome = this.roll();

            if (firstThrow) {
                if (outcome == 7 || outcome == 11) {
                    isFinished = true;
                    isWin = true;
                } else if (outcome == 2 || outcome == 3 || outcome == 12) {
                    isFinished = true;
                    isWin = false;
                } else {
                    firstThrow = false;
                    point = outcome;
                }
            } else {
                if (outcome == point) {
                    isFinished = true;
                    isWin = true;
                } else if (outcome == 7) {
                    isFinished = true;
                    isWin = false;
                }
            }
        }
        return isWin;
    }
}
