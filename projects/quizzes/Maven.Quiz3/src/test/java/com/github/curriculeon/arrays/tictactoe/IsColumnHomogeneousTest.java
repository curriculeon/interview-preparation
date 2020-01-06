package com.github.curriculeon.arrays.tictactoe;

import com.github.curriculeon.arrays.TicTacToe;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class IsColumnHomogeneousTest {
    @Test
    public void test1() {
        // given
        Integer columnIndex = 0;
        String[] row1 = {"O", "X", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertTrue(ticTacToe.isColumnHomogeneous(columnIndex));
    }

    @Test
    public void test2() {
        // given
        Integer columnIndex = 0;
        String[] row1 = {"O", "X", "X"};
        String[] row2 = {"X", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertFalse(ticTacToe.isColumnHomogeneous(columnIndex));
    }


    @Test
    public void test3() {
        // given
        Integer columnIndex = 1;
        String[] row1 = {"O", "X", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertTrue(ticTacToe.isColumnHomogeneous(columnIndex));
    }

    @Test
    public void test4() {
        // given
        Integer columnIndex = 2;
        String[] row1 = {"O", "X", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);

        Assert.assertFalse(ticTacToe.isColumnHomogeneous(columnIndex));
    }

}
