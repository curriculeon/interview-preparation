package com.github.curriculeon.arrays.wavegenerator;

import com.github.curriculeon.arrays.WaveGenerator;
import org.junit.Test;
import com.github.curriculeon.utils.TestUtils;

/**
 * @author leon on 10/12/2018.
 */
public class WaveTest {
    @Test
    public void test0() {
        // given
        String input = "AAAAAAA";
        String[] expected = {
                "Aaaaaaa",
                "aAaaaaa",
                "aaAaaaa",
                "aaaAaaa",
                "aaaaAaa",
                "aaaaaAa",
                "aaaaaaA"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        // given
        String input = "aaaaaaa";
        String[] expected = {
                "Aaaaaaa",
                "aAaaaaa",
                "aaAaaaa",
                "aaaAaaa",
                "aaaaAaa",
                "aaaaaAa",
                "aaaaaaA"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "A_A_A";
        String[] expected = {
                "A_a_a",
                "a_A_a",
                "a_a_A"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        String input = "Radioactivity";
        String[] expected = {
                "Radioactivity",
                "rAdioactivity",
                "raDioactivity",
                "radIoactivity",
                "radiOactivity",
                "radioActivity",
                "radioaCtivity",
                "radioacTivity",
                "radioactIvity",
                "radioactiVity",
                "radioactivIty",
                "radioactiviTy",
                "radioactivitY"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String input = "the quick brown fox";
        String[] expected = {
                "The quick brown fox",
                "tHe quick brown fox",
                "thE quick brown fox",
                "the Quick brown fox",
                "the qUick brown fox",
                "the quIck brown fox",
                "the quiCk brown fox",
                "the quicK brown fox",
                "the quick Brown fox",
                "the quick bRown fox",
                "the quick brOwn fox",
                "the quick broWn fox",
                "the quick browN fox",
                "the quick brown Fox",
                "the quick brown fOx",
                "the quick brown foX"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test6() {
        // given
        String input = "the quick brown f0x!";
        String[] expected = {
                "The quick brown f0x!",
                "tHe quick brown f0x!",
                "thE quick brown f0x!",
                "the Quick brown f0x!",
                "the qUick brown f0x!",
                "the quIck brown f0x!",
                "the quiCk brown f0x!",
                "the quicK brown f0x!",
                "the quick Brown f0x!",
                "the quick bRown f0x!",
                "the quick brOwn f0x!",
                "the quick broWn f0x!",
                "the quick browN f0x!",
                "the quick brown F0x!",
                "the quick brown f0X!"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        String input = "hello";
        String[] expected = {
                "Hello",
                "hEllo",
                "heLlo",
                "helLo",
                "hellO"};
        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test8() {
        String input = "two words";
        String[] expected = {
                "Two words",
                "tWo words",
                "twO words",
                "two Words",
                "two wOrds",
                "two woRds",
                "two worDs",
                "two wordS"};
        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test9() {
        String input = " gap ";
        String[] expected = {
                " Gap ",
                " gAp ",
                " gaP "};
        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test10() {
        String input = "";
        String[] expected = {};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
