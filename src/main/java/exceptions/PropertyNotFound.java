package exceptions;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public class PropertyNotFound extends RuntimeException {

    public PropertyNotFound(String message) {
        super(message);
    }

}
