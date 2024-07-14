import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        Map<String, String> countryCapitals = new HashMap<>();
//
//        countryCapitals.put("Argentina", "Buenos Aires");
//        countryCapitals.put("Colombia", "Bogotá");
//        countryCapitals.put("Uruguay", "Montevideo");
//        countryCapitals.put("Francia", "París");
//
//        System.out.println(countryCapitals);
//
//        countryCapitals.remove();
//        //para eliminar elemento se agrega el object y la key
//
//        System.out.println(countryCapitals);

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student(1,"Juan", 7.4));
        studentMap.put(2, new Student(2,"Maria", 9.4));
        studentMap.put(3, new Student(1,"Sebastian", 10.0));

        System.out.println(studentMap);


    }
}