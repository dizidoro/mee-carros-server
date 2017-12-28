package controllers;

public class Error {
    public String message;
    public Code code;

    public Error(String message){
        this.message = message;
    }

    public Error(String message, Code code){
        this.message = message;
        this.code = code;
    }

    public enum Code {

    }
}
