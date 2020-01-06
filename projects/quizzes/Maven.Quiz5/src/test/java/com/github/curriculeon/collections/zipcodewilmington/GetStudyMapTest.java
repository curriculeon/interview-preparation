package com.github.curriculeon.collections.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.collections.ZipCodeWilmington;
import com.github.curriculeon.collections.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class GetStudyMapTest {
    @Test
    public void test0() {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student expectedStudent1 = new Student();
        Double expectedStudyTime1 = 0.0;
        expectedStudent1.learn(expectedStudyTime1);
        zipCodeWilmington.enroll(expectedStudent1);



        // when
        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        List<Map.Entry<Student, Double>> entrySet = new ArrayList<>(studyMap.entrySet());
        Map.Entry<Student, Double> firstEntry = entrySet.get(0);

        Student actualStudent1 = firstEntry.getKey();
        Double actualStudyTime1 = firstEntry.getValue();



        // then
        Assert.assertEquals(expectedStudent1, actualStudent1);
        Assert.assertEquals(expectedStudyTime1, actualStudyTime1);
    }

    @Test
    public void test1() {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student expectedStudent1 = new Student();
        Double expectedStudyTime1 = expectedStudent1.getTotalStudyTime();
        zipCodeWilmington.enroll(expectedStudent1);



        // when
        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        List<Map.Entry<Student, Double>> entrySet = new ArrayList<>(studyMap.entrySet());
        Map.Entry<Student, Double> firstEntry = entrySet.get(0);

        Student actualStudent1 = firstEntry.getKey();
        Double actualStudyTime1 = firstEntry.getValue();



        // then
        Assert.assertEquals(expectedStudent1, actualStudent1);
        Assert.assertEquals(expectedStudyTime1, actualStudyTime1);
    }

    @Test
    public void test2() {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student expectedStudent1 = new Student(1);
        Student expectedStudent2 = new Student(2);

        zipCodeWilmington.enroll(expectedStudent1);
        zipCodeWilmington.enroll(expectedStudent2);

        Double expectedStudyTime1 = 500.0;
        Double expectedStudyTime2 = 250.0;

        expectedStudent1.learn(expectedStudyTime1);
        expectedStudent2.learn(expectedStudyTime2);



        // when
        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        List<Map.Entry<Student, Double>> entrySet = new ArrayList<>(studyMap.entrySet());
        Map.Entry<Student, Double> firstEntry = entrySet.get(0);
        Map.Entry<Student, Double> secondEntry = entrySet.get(1);

        Student actualStudent1 = firstEntry.getKey();
        Student actualStudent2 = secondEntry.getKey();

        Double actualStudyTime1 = firstEntry.getValue();
        Double actualStudyTime2 = secondEntry.getValue();



        // then
        Assert.assertEquals(expectedStudent1, actualStudent1);
        Assert.assertEquals(expectedStudyTime1, actualStudyTime1);


        Assert.assertEquals(expectedStudent2, actualStudent2);
        Assert.assertEquals(expectedStudyTime2, actualStudyTime2);
    }

    @Test
    public void test3() {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student expectedStudent1 = new Student(3);
        Student expectedStudent2 = new Student(4);
        Student expectedStudent3 = new Student(5);

        zipCodeWilmington.enroll(expectedStudent1);
        zipCodeWilmington.enroll(expectedStudent2);
        zipCodeWilmington.enroll(expectedStudent3);

        Double expectedStudyTime1 = 500.0;
        Double expectedStudyTime2 = 250.0;
        Double expectedStudyTime3 = 125.0;

        expectedStudent1.learn(expectedStudyTime1);
        expectedStudent2.learn(expectedStudyTime2);
        expectedStudent3.learn(expectedStudyTime3);



        // when
        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        List<Map.Entry<Student, Double>> entrySet = new ArrayList<>(studyMap.entrySet());
        Map.Entry<Student, Double> firstEntry = entrySet.get(0);
        Map.Entry<Student, Double> secondEntry = entrySet.get(1);
        Map.Entry<Student, Double> thirdEntry = entrySet.get(2);

        Student actualStudent1 = firstEntry.getKey();
        Student actualStudent2 = secondEntry.getKey();
        Student actualStudent3 = thirdEntry.getKey();

        Double actualStudyTime1 = firstEntry.getValue();
        Double actualStudyTime2 = secondEntry.getValue();
        Double actualStudyTime3 = thirdEntry.getValue();



        // then
        Assert.assertEquals(expectedStudent1, actualStudent1);
        Assert.assertEquals(expectedStudyTime1, actualStudyTime1);


        Assert.assertEquals(expectedStudent2, actualStudent2);
        Assert.assertEquals(expectedStudyTime2, actualStudyTime2);


        Assert.assertEquals(expectedStudent3, actualStudent3);
        Assert.assertEquals(expectedStudyTime3, actualStudyTime3);
    }




    @Test
    public void test4() {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student expectedStudent1 = new Student(3);
        Student expectedStudent2 = new Student(4);
        Student expectedStudent3 = new Student(5);

        zipCodeWilmington.enroll(expectedStudent1);
        zipCodeWilmington.enroll(expectedStudent2);
        zipCodeWilmington.enroll(expectedStudent3);

        Double expectedStudyTime1 = 500.0;
        Double expectedStudyTime2 = 1000.0;
        Double expectedStudyTime3 = 2000.0;

        expectedStudent1.learn(expectedStudyTime1);
        expectedStudent2.learn(expectedStudyTime2);
        expectedStudent3.learn(expectedStudyTime3);



        // when
        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        List<Map.Entry<Student, Double>> entrySet = new ArrayList<>(studyMap.entrySet());
        Map.Entry<Student, Double> firstEntry = entrySet.get(0);
        Map.Entry<Student, Double> secondEntry = entrySet.get(1);
        Map.Entry<Student, Double> thirdEntry = entrySet.get(2);

        Student actualStudent1 = firstEntry.getKey();
        Student actualStudent2 = secondEntry.getKey();
        Student actualStudent3 = thirdEntry.getKey();

        Double actualStudyTime1 = firstEntry.getValue();
        Double actualStudyTime2 = secondEntry.getValue();
        Double actualStudyTime3 = thirdEntry.getValue();



        // then
        Assert.assertEquals(expectedStudent1, actualStudent1);
        Assert.assertEquals(expectedStudyTime1, actualStudyTime1);


        Assert.assertEquals(expectedStudent2, actualStudent2);
        Assert.assertEquals(expectedStudyTime2, actualStudyTime2);


        Assert.assertEquals(expectedStudent3, actualStudent3);
        Assert.assertEquals(expectedStudyTime3, actualStudyTime3);
    }

    @Test
    public void test5() {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student expectedStudent1 = new Student(3);
        Student expectedStudent2 = new Student(4);

        zipCodeWilmington.enroll(expectedStudent1);
        zipCodeWilmington.enroll(expectedStudent2);

        Double expectedStudyTime1 = 500.0;
        Double expectedStudyTime2 = 1000.0;

        expectedStudent1.learn(expectedStudyTime1);
        expectedStudent2.learn(expectedStudyTime2);



        // when
        Map<Student, Double> studyMap = zipCodeWilmington.getStudyMap();
        List<Map.Entry<Student, Double>> entrySet = new ArrayList<>(studyMap.entrySet());
        Map.Entry<Student, Double> firstEntry = entrySet.get(0);
        Map.Entry<Student, Double> secondEntry = entrySet.get(1);

        Student actualStudent1 = firstEntry.getKey();
        Student actualStudent2 = secondEntry.getKey();

        Double actualStudyTime1 = firstEntry.getValue();
        Double actualStudyTime2 = secondEntry.getValue();



        // then
        Assert.assertEquals(expectedStudent1, actualStudent1);
        Assert.assertEquals(expectedStudyTime1, actualStudyTime1);


        Assert.assertEquals(expectedStudent2, actualStudent2);
        Assert.assertEquals(expectedStudyTime2, actualStudyTime2);
    }
}
