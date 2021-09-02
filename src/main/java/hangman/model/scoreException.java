package hangman.model;

public class scoreException extends Exception{

    public static final String INVALID_SCORE = "El score es invalido, puntaje negativo";

    public scoreException(String e){
        super(e);
    }
}
