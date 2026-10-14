package software.ulpgc.katas;
import java.time.LocalDate;
public record Task (String title, LocalDate deadline) {
    public int weeksRemaining()
    {
        return toWeeks(deadline.toEpochDay() - LocalDate.now().toEpochDay());
    }
    public static final double DAYS_PER_WEEK = 7.0;
    private int toWeeks(long days) {
        return (int) (days / DAYS_PER_WEEK);
    }
}
