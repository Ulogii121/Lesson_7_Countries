import java.util.Random;

public enum Country {
    RUSSIA("Россия", true),
    USA("США", true),
    ITALY("Италия", true),
    NORTH_KOREA("Северная Корея", false),
    SPAIN("Испания", false);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return name() + " (" + ruName + ")";
    }

    public String getRuName() {
        return ruName;
    }

    public boolean getIsOpen() {
        return isOpen;
    }


    static Country getByRuName(final String input) throws NoSuchCountryException {
        System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
        //Ищем страну и выводим в консоль
        try {
            for (Country name : values()) {
                if (name.ruName.equals(input)) {
                    return name;
                }
            }
        } catch (IllegalArgumentException iae) {
            throw new NoSuchCountryException(input, iae);
        }
        System.out.println("Ерунда! Если введёшь адекватное название, то получишь что-то вроде этого:");
        int i = new Random().nextInt(Country.values().length);
        return Country.values()[i];
    }
}
