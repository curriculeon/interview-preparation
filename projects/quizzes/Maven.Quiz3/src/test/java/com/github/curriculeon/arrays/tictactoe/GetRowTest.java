package com.github.curriculeon.arrays.tictactoe;

import com.github.curriculeon.arrays.TicTacToe;
import org.junit.Test;
import com.github.curriculeon.utils.TestUtils;

/**
 * @author leon on 10/12/2018.
 */
public class GetRowTest {
    @Test
    public void test1() {
        // given
        Integer indexToFetch = 0;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        String[] expected = row1;

        // when
        String[] actual = ticTacToe.getRow(indexToFetch);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer indexToFetch = 1;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        String[] expected = row2;

        // when
        String[] actual = ticTacToe.getRow(indexToFetch);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Integer indexToFetch = 2;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        String[] expected = row3;

        // when
        String[] actual = ticTacToe.getRow(indexToFetch);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
