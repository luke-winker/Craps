package cs245.winker;

import java.util.Random;

public class Dice {
    private int mNumSides;

    public Dice() {
        mNumSides = 6;
    }

    public Dice(int numSides) {
        mNumSides = numSides;
    }

    public int rollDie() {
        Random rand = new Random();
        int outcome = rand.nextInt(mNumSides) + 1;
        return outcome;
    }
}
