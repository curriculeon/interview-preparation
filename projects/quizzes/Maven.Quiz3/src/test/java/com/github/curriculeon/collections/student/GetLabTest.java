package com.github.curriculeon.collections.student;

import com.github.curriculeon.collections.Lab;
import com.github.curriculeon.collections.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class GetLabTest {
    @Test
    public void test1() {
        // given
        String labName = "duplicate deleter";
        Lab expected = new Lab(labName);
        Student student = new Student();
        student.forkLab(expected);

        // when
        Lab actual = student.getLab(labName);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String labName = "learner lab";
        Lab expected = new Lab(labName);
        Student student = new Student();
        student.forkLab(expected);

        // when
        Lab actual = student.getLab(labName);

        // then
        Assert.assertEquals(expected, actual);
    }
}
