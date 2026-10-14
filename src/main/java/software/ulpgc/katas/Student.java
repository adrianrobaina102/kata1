package software.ulpgc.katas;
import java.time.LocalDate;
public record Student (String name, LocalDate enrollmentDate){
    public static final double DAYS_PER_YEAR = 365.25;
    public int seniority() {
        return toYear(LocalDate.now().toEpochDay() - enrollmentDate.toEpochDay());
    }

    private int toYear(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
