package com.github.curriculeon.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public interface Worker {
    void increaseHoursWorked(Double numberOfHours);
    Double getHoursWorked();
    Double getHourlyWage();
    Double getMoneyEarned();
}
