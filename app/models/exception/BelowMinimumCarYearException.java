package models.exception;

public class BelowMinimumCarYearException extends Exception {
    public BelowMinimumCarYearException(Integer year, Integer minimumYear) {
        super(year + " é menor que o ano mínimo de " + minimumYear);
    }

}
