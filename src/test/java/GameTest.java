import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canRoll() {
        game.roll(0);
    }

    private void rollMany(int frames, int pins) {
        for (int i = 0; i < frames; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }

    @Test
    public void gutterGame() {
        rollMany(0, 20);
        assertThat(game.getScore(), is(0));
    }

    @Test
    public void allOnes() {
        rollMany(1, 20);
        assertThat(game.getScore(), is(20));
    }

    @Test
    public void oneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertThat(game.getScore(),is(16));
    }

    @Test
    public void oneStrikes() {
        rollStrike();
        game.roll(5);
        game.roll(3);
        rollMany(16,0);
        assertThat(game.getScore(),is(26));
    }

}
