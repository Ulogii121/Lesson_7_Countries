import java.io.IOException;

public class NoSuchCountryException extends IOException {
    public NoSuchCountryException(final String input) {
        super("Страны '" + input + "' не существует.");
    }
}
