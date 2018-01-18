package com.liumapp.pattern.schedule;

import com.liumapp.pattern.Pattern;

/**
 * Created by liumapp on 1/5/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SchedulePattern extends Pattern {

    public static enum IntervalUnit {
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK,
        MONTH,
        YEAR;

        private IntervalUnit() {
        }
    }

}
