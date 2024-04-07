package Customs;

public class CustomErrorMessage {

    private final static String notFoundErrorMessage = "No se encontro el objeto";

    private final static String alreadyExistsError = "ya existe un objeto con esta clave";

    public static String GetNotFoundErrorMessage() {
        return notFoundErrorMessage;
    }

    public static String GetAlreadyExistsErrorMessage() {
        return alreadyExistsError;
    }

}
