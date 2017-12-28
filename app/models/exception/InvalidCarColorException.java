package models.exception;

public class InvalidCarColorException extends Exception {
    public InvalidCarColorException(String color) {
        super("Cor de carro '"+color+"' inválida");
    }
}
