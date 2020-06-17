import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    static final long billion = 1_000_000_000l;
    private LocalDateTime aBillionSecondsLater;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.aBillionSecondsLater = moment.plusSeconds(billion);
    }

    public LocalDateTime getDateTime() {
        return aBillionSecondsLater;
    }
}
