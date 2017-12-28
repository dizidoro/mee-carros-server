package models.car;

import models.exception.BelowMinimumCarYearException;

import java.util.Calendar;

class Year {
    private static final Integer lastXYears = 30;
    private final Integer value;

    public Year(Integer year) throws BelowMinimumCarYearException {
        Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
        //sum 1 to count from current year
        Integer minimumYear = currentYear - lastXYears + 1;
        if (year < minimumYear) {
            throw new BelowMinimumCarYearException(year, minimumYear);
        }
        if (year > currentYear){}
        this.value = year;
    }

    public Integer getValue() {
        return value;
    }
}
