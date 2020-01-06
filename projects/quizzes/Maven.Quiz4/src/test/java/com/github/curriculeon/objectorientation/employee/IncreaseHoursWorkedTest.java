package com.github.curriculeon.objectorientation.employee;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.objectorientation.account.Employee;
import com.github.curriculeon.objectorientation.account.Worker;

/**
 * @author leon on 30/12/2018.
 */
public class IncreaseHoursWorkedTest {

    @Test
    public void test1() {
        // given
        test(0.0, 1.0);
    }

    @Test
    public void test2() {
        // given
        test(0.0, 5.0);
    }


    @Test
    public void test4() {
        // given
        test(1.0, 10.0);
    }


    @Test
    public void test5() {
        // given
        test(2.0, 2.0);
    }


    private void test(Double numberOfHoursWorkedSoFar, Double numberOfHoursToWork) {
        // given
        Employee employee = new Employee();
        Worker employeeAsWorker = (Worker) employee;

        employeeAsWorker.increaseHoursWorked(numberOfHoursWorkedSoFar);
        Double expected = numberOfHoursWorkedSoFar + numberOfHoursToWork;


        // when
        employeeAsWorker.increaseHoursWorked(numberOfHoursToWork);
        Double actual = employeeAsWorker.getHoursWorked();


        // then
        Assert.assertEquals(expected, actual);
    }
}
