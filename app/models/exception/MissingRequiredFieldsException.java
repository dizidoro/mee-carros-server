package models.exception;

public class MissingRequiredFieldsException extends Exception{
    public MissingRequiredFieldsException() {
        super("Faltando alguns campos de carro");
    }
}
