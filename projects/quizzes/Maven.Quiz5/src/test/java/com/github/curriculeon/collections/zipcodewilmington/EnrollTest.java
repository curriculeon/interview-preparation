package com.github.curriculeon.collections.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.ZipCodeWilmington;
import com.github.curriculeon.collections.Student;

/**
 * @author leon on 11/12/2018.
 */
public class EnrollTest {
    @Test
    public void test1() {
        test(new Student());
    }

    @Test
    public void test2() {
        test(
                new Student(),
                new Student());
    }

    @Test
    public void test3() {
        test(
                new Student(),
                new Student(),
                new Student());
    }

    public void test(Student... students) {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();

        for (Student student : students) {
            // when
            zipCodeWilmington.enroll(student);

            // then
            Assert.assertTrue(zipCodeWilmington.isEnrolled(student));
        }
    }
}
