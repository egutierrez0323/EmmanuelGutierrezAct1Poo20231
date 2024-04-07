package Customs;

public class CustomErrorMessage {

    private final static String notFoundError = "No se encontro el objeto";

    private final static String alreadyExistsError = "ya existe un objeto con esta clave";

    public static String GetNotFoundErrorMessage() {
        return notFoundError;
    }

    public static String GetAlreadyExistsErrorMessage() {
        return alreadyExistsError;
    }

}
