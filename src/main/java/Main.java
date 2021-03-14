import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws NoSuchCountryException {

        //Вывод всех стран на экран
        System.out.println(Arrays.toString(Country.values()));

        //Ловим
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            Country ourCountry = Country.valueOf(input);
            //System.out.println(Country.valueOf(input));
            if (ourCountry.getIsOpen()) {
                System.out.println("Страна " + ourCountry + " открыта для посещения.");
            } else {
                System.out.println("Страна " + ourCountry + " закрыта для посещения.");
            }
        } catch (IllegalArgumentException e) {
            Country ourCountry = Country.getByRuName(input);
            if (ourCountry.getIsOpen()) {
                System.out.println("Страна " + ourCountry + " открыта для посещения.");
            } else {
                System.out.println("Страна " + ourCountry + " закрыта для посещения.");
            }
        } catch (NullPointerException e) {
            System.out.println("Поле не должно быть пустым!");
        }
    }
}