package com.alamkanak.weekview;

import java.util.Calendar;

/**
 * Created by Raquib on 1/6/2015.
 */
public interface DateTimeInterpreter {
    String interpretDate(Calendar date);
    Calendar interpretStartDate();
    String interpretTime(int hour);
    int interpretStartTime();
    int interpretHours();
}
