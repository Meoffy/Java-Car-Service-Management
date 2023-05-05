package GUI.Exceptions;

public class TooManyThingsException extends Exception{
    @Override
    public String getMessage() {
        return "Lack of space!";
    }
}