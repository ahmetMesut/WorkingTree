package com.ahmetmesut.kata;

public class Game {

    private int[] rolls = new int[21];
    private int currentRoll;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += sumOfFrameRolls(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + spareBonus(frameIndex);
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int sumOfFrameRolls(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private boolean isSpare(int frameIndex) {
        return sumOfFrameRolls(frameIndex) == 10;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

}
