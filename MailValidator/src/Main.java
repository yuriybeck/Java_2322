import java.util.NoSuchElementException;

/**
 * Task description
 * 1. E-Mail Adresse über die Terminal aufnehmen;
 * 2. prüfe ob "@" in dem Text vorhanden ist;
 * 3. Der Text beinhaltet eine Domain nach dem "@".
 * Domain ist valide wenn 3 vor dem "." und min. 2 nach dem ".";
 * 4. Text vor dem "@" muss min. 3 Zeichen sein;
 * 5. Das Programm soll uns "E-Mail Addresse is valid."
 * 6. Wenn der Text nicht eine gültige E-Mail-Adresse ist,
 * wird eine Exception geworfen und der Benutzer wird darauf hingewiesen wo der Fehler ist
 * und aufgefordert noch ein Mal die Adresse einzugeben.
 */
public class Main {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception ex) {
            System.out.println("FATAL: " + ex.getMessage());
        }
    }

    private static void test() {
        try {
            String email1 = null;
            System.out.println(Validator.isValid(email1));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String email2 = "";
            System.out.println(Validator.isValid(email2));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try{
            String email3 = " ";
            System.out.println(Validator.isValid(email3));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String email4 = "@";
            System.out.println("contains @: " + Validator.isValid(email4));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String email5 = " @ ";
            System.out.println("contains @: " + Validator.isValid(email5));
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String email6 = "yuriybeck.de";
            System.out.println(Validator.isValid(email6));
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }

        String email7 = "yuriy@beck.de";
        System.out.println(Validator.isValid(email7));
    }
}