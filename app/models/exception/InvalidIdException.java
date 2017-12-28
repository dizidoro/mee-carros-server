package models.exception;

public class InvalidIdException extends Exception {
    public InvalidIdException(Long value) {
        super("id " + value + " invalido");
    }
}
