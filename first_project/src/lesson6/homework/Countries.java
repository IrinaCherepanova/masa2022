package lesson6.homework;

import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();
        countries.put("Moscow", "Russia");
        countries.put("Tel-Aviv", "Israel");
        countries.put("New York", "USA");
        countries.put("Paris", "France");
        countries.put("Chelyabinsk", "Russia");

        System.out.println("Each country:");
        countries.forEach((city, country) -> System.out.println(country));

        System.out.println();
        System.out.println("City - Country:");
        countries.forEach((city, country) -> System.out.println(city + " - " + country));

        System.out.println();
        System.out.println("Is Moscow in the list? " + (countries.containsKey("Moscow")? "Yes": "No"));
        System.out.println("Is London in the list? " + (countries.containsKey("London")? "Yes": "No"));
        System.out.println("Is Germany in the list? " + (countries.containsValue("Germany")? "Yes": "No"));
        System.out.println("Is USA in the list? " + (countries.containsValue("USA")? "Yes": "No"));
    }
}
