package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task kata = new Task("Deliver Kata 1", LocalDate.of(2026, 11, 15));
        System.out.println(kata.weeksRemaining());
    }
}
