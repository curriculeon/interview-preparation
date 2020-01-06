package com.github.curriculeon.arrays.tictactoe;

import com.github.curriculeon.arrays.TicTacToe;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class IsRowHomogeneousTest {
    @Test
    public void test1() {
        // given
        Integer rowIndex = 0;
        String[] row1 = {"X", "X", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertTrue(ticTacToe.isRowHomogenous(rowIndex));
    }

    @Test
    public void test2() {
        // given
        Integer rowIndex = 1;
        String[] row1 = {"X", "X", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertTrue(ticTacToe.isRowHomogenous(rowIndex));
    }


    @Test
    public void test3() {
        // given
        Integer rowIndex = 2;
        String[] row1 = {"X", "X", "X"};
        String[] row2 = {"O", "O", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertFalse(ticTacToe.isRowHomogenous(rowIndex));
    }


    @Test
    public void test4() {
        // given
        Integer rowIndex = 2;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "O", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertTrue(ticTacToe.isRowHomogenous(rowIndex));
    }
}
