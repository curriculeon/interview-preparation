package com.github.curriculeon.collections.student;

import com.github.curriculeon.collections.Lab;
import com.github.curriculeon.collections.LabStatus;
import com.github.curriculeon.collections.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class ToStringTest {
    @Test
    public void test1() {
        // given
        String labName = "duplicate deleter";
        Lab duplicateDeleter = new Lab("duplicate deleter");
        Lab learnerLab = new Lab("learner lab");
        Student student = new Student();
        LabStatus completed = LabStatus.valueOf("COMPLETED");
        String expected = "duplicate deleter > COMPLETED\nlearner lab > PENDING";

        // when
        student.forkLab(learnerLab);
        student.forkLab(duplicateDeleter);
        student.setLabStatus(labName, completed);
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String casinoLabName = "casino";
        String learnerLabName = "learner lab";
        Lab casino = new Lab(casinoLabName);
        Lab learnerLab = new Lab(learnerLabName);
        Student student = new Student();
        LabStatus completed = LabStatus.valueOf("COMPLETED");
        LabStatus incomplete = LabStatus.valueOf("INCOMPLETE");
        String expected = "casino > COMPLETED\nlearner lab > INCOMPLETE";

        // when
        student.forkLab(learnerLab);
        student.forkLab(casino);
        student.setLabStatus(casinoLabName, completed);
        student.setLabStatus(learnerLabName, incomplete);
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }
}
