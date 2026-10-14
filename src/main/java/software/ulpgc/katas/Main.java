package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student carlos = new Student("Carlos", LocalDate.of(2023, 9, 10));
        System.out.println(carlos.seniority());
    }
}
