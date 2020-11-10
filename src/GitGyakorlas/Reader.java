package GitGyakorlas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Reader {
    public static void read() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("files/us-500.csv.csv másolata.csv másolata.csv másolata"));
        List<Person> personList = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] splitit = sc.nextLine().split(",");
            String firstName = splitit[0];
            String lastnName = splitit[1];
            String mail = splitit[10];
            String city = splitit[4];
            Person person = new Person(firstName, lastnName, city, mail);
            personList.add(person);
        }

    }
}