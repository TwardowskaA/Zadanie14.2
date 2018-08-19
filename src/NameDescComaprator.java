import java.util.Comparator;

public class NameDescComaprator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}
