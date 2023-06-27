import java.util.NoSuchElementException;

/**
 * Helper class for validation of email addresses.
 */
public class Validator {

    /**
     * Validates given text. if the text is valid email address.
     * @param email String - valid email address
     * @return boolean, true if the email address is valid, false if not.
     * @throws NullPointerException throw if email null or empty, or not longer then 10 chars
     * @throws NoSuchElementException throw if email does <b>not contains</b> '@' sign
     */
    public static boolean isValid(String email)
            throws NullPointerException, NoSuchElementException {

        if (isEmpty(email)) {
            throw new NullPointerException("ERROR: E-Mail text is null or empty!");
        }

        if (!hasCorrectLength(email)) {
            throw new NullPointerException("ERROR: E-Mail address is to short!");
        }

        if (!containsMailSign(email)) {
            //TODO: task
            throw new NoSuchElementException("ERROR: E-Mail Address is not valid, it does not contains @!");
        }

        return true;
    }

    /**
     * Validates if the text null or empty. Also empty space.
     * @param text String - valid email address
     * @return boolean - true if the email address is empty or null, false otherwise
     */
    private static boolean isEmpty(String text) {
        //1234567890
        return text == null || text.isBlank();
    }

    /**
     * Validate wherther the text length is equal or bigger 10.
     * @param text String - valid email address
     * @return
     */
    private static boolean hasCorrectLength(String text) {
        //1234567890
        return text.length() >= 10;
    }

    private static boolean containsMailSign(String mail) {
        return mail.contains("@");
    }
}
