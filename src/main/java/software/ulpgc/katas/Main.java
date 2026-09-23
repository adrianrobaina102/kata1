package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person lucia = new Person("Lucia", LocalDate.of(2005, 5, 12));
        System.out.println(lucia.age());
    }
}
