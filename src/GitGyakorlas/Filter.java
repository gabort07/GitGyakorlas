package GitGyakorlas;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void cityFilter(String city, List<Person> personList){
       List<Person>personByGivenCity=new ArrayList<>();
        for (Person person:personList){
            if (person.getCity().equals(city)){
                personByGivenCity.add(person);
            }

        }
    }

}
