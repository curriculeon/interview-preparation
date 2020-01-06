package com.github.curriculeon.arrays.tictactoe;

import com.github.curriculeon.arrays.TicTacToe;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class GetWinner {
    @Test
    public void testDiagonal1() {
        // given
        String expected = "X";
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "X"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        // when
        String actual = ticTacToe.getWinner();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDiagonal2() {
        // given
        String expected = "X";
        String[] row1 = {"O", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"X", "O", "X"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        // when
        String actual = ticTacToe.getWinner();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRow1() {
        // given
        String expected = "O";
        String[] row1 = {"O", "O", "O"};
        String[] row2 = {"X", "X", "O"};
        String[] row3 = {"O", "X", "X"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        // when
        String actual = ticTacToe.getWinner();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRow2() {
        // given
        String expected = "O";
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"X", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        // when
        String actual = ticTacToe.getWinner();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColumn1() {
        // given
        String expected = "X";
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"X", "O", "O"};
        String[] row3 = {"X", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        // when
        String actual = ticTacToe.getWinner();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColumn2() {
        // given
        String expected = "X";
        String[] row1 = {"O", "X", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"X", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        // when
        String actual = ticTacToe.getWinner();

        // then
        Assert.assertEquals(expected, actual);
    }
}