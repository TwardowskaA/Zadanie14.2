import java.util.Comparator;

public class LastNameDescComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.getLastName().compareTo(o1.getLastName());
    }
}
