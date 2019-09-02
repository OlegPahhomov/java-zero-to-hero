package ee.itcollage.level8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
        Map<String, Person> map = new HashMap<>();
        for (Person person : people) {
           map.put(person.getIdCode(), person);
        }
        return map;
    }

}
