package com.github.curriculeon.arrays.tictactoe;

import com.github.curriculeon.arrays.TicTacToe;
import com.github.curriculeon.utils.TestUtils;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class GetColumnTest {
    @Test
    public void test1() {
        // given
        Integer columnIndexToFetch = 0;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        String[] expected = {"X", "O", "O"};

        // when
        String[] actual = ticTacToe.getColumn(columnIndexToFetch);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer columnIndexToFetch = 1;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        String[] expected = {"O", "X", "X"};

        // when
        String[] actual = ticTacToe.getColumn(columnIndexToFetch);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Integer columnIndexToFetch = 2;
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "X"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        TicTacToe ticTacToe = new TicTacToe(board);
        String[] expected = {"X", "X", "O"};

        // when
        String[] actual = ticTacToe.getColumn(columnIndexToFetch);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}