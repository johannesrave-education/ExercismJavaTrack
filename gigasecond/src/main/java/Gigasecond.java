import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    static final private long BILLION = 1_000_000_000L;
    final private LocalDateTime ALOTLATER;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.ALOTLATER = moment.plusSeconds(BILLION);
    }

    public LocalDateTime getDateTime() {
        return ALOTLATER;
    }
}
