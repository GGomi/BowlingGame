public class Game {

    private int[] rolls = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public Integer getScore() {
        int score = 0;

        for(int frame = 0; frame < 10; frame++) {
            int firstRollInFrame = frame* 2;
            if(isSpare(firstRollInFrame)) {
                score += 10 + rolls[firstRollInFrame + 2];
            } else {
                score += rolls[frame * 2] + rolls[frame * 2 + 1];
            }
        }

        return score;
    }

    private boolean isSpare(int firstRollInFrame) {
        return rolls[firstRollInFrame] + rolls[firstRollInFrame + 1] == 10;
    }
}
