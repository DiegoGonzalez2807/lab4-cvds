package hangman.model;

public class scoreException extends Exception{

    public static final String INVALID_SCORE = "El score es invalido, puntaje negativo";

    public static final String NEGATIVE_NUMBER = "El numero es negativo";

    public scoreException(String e){
        super(e);
    }
}
