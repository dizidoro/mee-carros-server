package models.exception;

public class NoCarWithSuchIdException extends Exception{
    public NoCarWithSuchIdException(Long id) {
        super("Não existe carro com id: " + id);
    }
}
