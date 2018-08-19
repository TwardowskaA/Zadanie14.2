import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski"));
        users.add(new User("Anna", "Nowak"));
        users.add(new User("Małgorzata", "Pudło"));
        users.add(new User("Zofia", "Bogacka"));

        System.out.println("W jaki sposób posortować listę:");
        Scanner scan = new Scanner(System.in);

        Compare[] values = Compare.values();
        for (Compare value : values) {
            System.out.println(value);
        }
        String userInput = scan.nextLine();

        Compare compare = Compare.valueOf(userInput);

        if(compare == Compare.valueOf(userInput)){
            users.sort(compare.comparator);
        }

        for (User user : users) {
            System.out.println(user);
        }

    }
}
