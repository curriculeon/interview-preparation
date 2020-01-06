package com.github.curriculeon.objectorientation.enums.rockpaperscissors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.objectorientation.enums.RockPaperScissorHandSign;

/**
 * @author leon on 09/12/2018.
 */
public class PaperTest {
    private RockPaperScissorHandSign sign;

    @Before
    public void setup() {
        // given
        this.sign = RockPaperScissorHandSign.valueOf("PAPER");
    }

    @Test
    public void testGetLoser() {
        RockPaperScissorHandSign loser = RockPaperScissorHandSign.valueOf("ROCK");
        Assert.assertEquals(loser, sign.getLoser());
    }

    @Test
    public void testGetWinner() {
        RockPaperScissorHandSign loser = RockPaperScissorHandSign.valueOf("SCISSOR");
        Assert.assertEquals(loser, sign.getWinner());
    }
}
