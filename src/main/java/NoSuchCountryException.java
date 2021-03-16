import java.io.IOException;

public class NoSuchCountryException extends IOException {
    public NoSuchCountryException(final String input, final IllegalArgumentException iae) {
        super("Страны '" + input + "' не существует.", iae);
    }
}
