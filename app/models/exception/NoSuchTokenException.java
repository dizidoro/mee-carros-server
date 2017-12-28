package models.exception;

public class NoSuchTokenException extends Exception{
    public NoSuchTokenException(String token) {
        super("Não existem carros cadastrados com o token: " + token);
    }
}
