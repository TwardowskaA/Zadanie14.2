import java.util.Comparator;

public enum Compare {
    IMIE_ROSNACO(new NameAscComparator()),
    IMIE_MALEJACO(new NameDescComaprator()),
    NAZWISKO_ROSNACO(new LastNameAscComparator()),
    NAZWISKO_MALEJACO(new LastNameDescComparator());

 final Comparator<User> comparator;

    Compare(Comparator<User> comparator) {
        this.comparator = comparator;
    }
}
